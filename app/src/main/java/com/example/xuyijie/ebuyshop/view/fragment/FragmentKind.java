package com.example.xuyijie.ebuyshop.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.adapter.GoodsAdapter;
import com.example.xuyijie.ebuyshop.base.BaseFragment;
import com.example.xuyijie.ebuyshop.contract.HomeSortContract;
import com.example.xuyijie.ebuyshop.gson.GoodGson;
import com.example.xuyijie.ebuyshop.presenter.HomeSortPresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by 徐易杰 on 2018/11/23.
 */

public class FragmentKind extends BaseFragment implements HomeSortContract.View {
    @InjectView(R.id.ry_sort)
    RecyclerView rySort;
    @InjectView(R.id.ry_list)
    RecyclerView ryList;
    @InjectView(R.id.sl_sort)
    SmartRefreshLayout slSort;
    @InjectView(R.id.fl_shopcar)
    FrameLayout flShopcar;
    public HomeSortPresenter homeSortPresenter = new HomeSortPresenter(this);
    private List<String> list = new ArrayList<>();
    private int layoutPosition;
    private SortItemAdapter sortAdapter = new SortItemAdapter(null);
    private GoodsAdapter goodAdapter;
    private List<GoodGson.GoodsBean> goodsList = new ArrayList<>();
    @Override
    protected int setView() {
        return R.layout.fragment_kind;
    }

    @Override
    protected void init(View view) {
        final GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        ryList.setLayoutManager(layoutManager);
        rySort.setLayoutManager(new LinearLayoutManager(getActivity()));
        goodAdapter = new GoodsAdapter(goodsList,getContext());
        ryList.setAdapter(goodAdapter);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        homeSortPresenter.getGoodsListByLocation("嘉兴", "热销产品", "1");//请求商品列表数据
        slSort.autoRefresh();
        slSort.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                String item = sortAdapter.getItem(layoutPosition);
                homeSortPresenter.getGoodsListByLocation("嘉兴", item, "1");
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.inject(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    private static final String TAG = "FragmentKind";
    @Override
    public void loadFailed(String msg) {
        Log.i(TAG, "loadFailed: "+msg);
        Toast.makeText(getContext(), "获取商品列表失败，请重试", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loadGoodsList(GoodGson goodGson) {
        slSort.finishRefresh();
        list.addAll(goodGson.getKind());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                }
            }
        }
        rySort.setAdapter(sortAdapter);
        sortAdapter.replaceData(list);//加载条目
        goodsList.clear();//清除当前所有商品
        goodsList.addAll(goodGson.getGoods());

        goodAdapter.notifyDataSetChanged();
    }

    //条目适配器
    private class SortItemAdapter extends BaseQuickAdapter<String, BaseViewHolder> {


        public SortItemAdapter(@Nullable List<String> data) {
            super(R.layout.ry_sort_list_item, data);

        }

        @Override
        protected void convert(final BaseViewHolder helper, final String item) {
            helper.setText(R.id.rb_sort, item)
                    .setTag(R.id.rb_sort, helper.getPosition())
                    .setOnClickListener(R.id.rb_sort, new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            layoutPosition = helper.getLayoutPosition();
                            notifyDataSetChanged();
                            homeSortPresenter.getGoodsListByLocation("嘉兴", item, "1");
                        }
                    });
            if (helper.getPosition() == layoutPosition) {
                helper.setChecked(R.id.rb_sort, true);
            } else {
                helper.setChecked(R.id.rb_sort, false);
            }
        }
    }
}
