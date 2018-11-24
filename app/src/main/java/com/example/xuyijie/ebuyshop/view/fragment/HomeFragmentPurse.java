package com.example.xuyijie.ebuyshop.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.base.BaseFragment;
import com.example.xuyijie.ebuyshop.contract.HomePurseContract;
import com.example.xuyijie.ebuyshop.gson.GoodGson;
import com.example.xuyijie.ebuyshop.presenter.HomePursePresenter;
import com.example.xuyijie.ebuyshop.util.GlideRoundTransform;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Administrator on 2018/11/23.
 */

public class HomeFragmentPurse extends BaseFragment implements HomePurseContract.View {
    @InjectView(R.id.ry_purse)
    RecyclerView ryPurse;
    private HomePursePresenter homePursePresenter = new HomePursePresenter(this);
    private GoodsAdapter goodsAdapter = new GoodsAdapter(null, getContext());

    @Override
    protected int setView() {
        return R.layout.fragment_home_purse;
    }

    @Override
    protected void init(View view) {
        homePursePresenter.getActiveList("嘉兴");
        ryPurse.setLayoutManager(new LinearLayoutManager(getContext()));
        ryPurse.setNestedScrollingEnabled(false);
        goodsAdapter.bindToRecyclerView(ryPurse);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

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

    @Override
    public void loadFailed(String msg) {
        Toast.makeText(getContext(), "获取订单错误", Toast.LENGTH_SHORT).show();
    }

    private static final String TAG = "HomeFragmentPurse";
    @Override
    public void loadPurseGson(List<GoodGson.GoodsBean> loadPurseList) {
        goodsAdapter.replaceData(loadPurseList);
        Log.i(TAG, "loadPurseGson: "+loadPurseList);
        ryPurse.setAdapter(goodsAdapter);
    }


    private class GoodsAdapter extends BaseQuickAdapter<GoodGson.GoodsBean, BaseViewHolder> {
        private Context context;


        public GoodsAdapter(@Nullable List<GoodGson.GoodsBean> data, Context context) {
            super(R.layout.ry_purse_goods_list_item, data);
            this.context = context;

        }


        @Override
        protected void convert(final BaseViewHolder helper, final GoodGson.GoodsBean item) {
            helper.setText(R.id.tv_name, item.getGoods_name())
                    .setText(R.id.tv_price, "标签："+ item.getGoods_tags())
                    .setOnClickListener(R.id.ll_item, new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
//                            Intent intent = new Intent(context, GoodsDetailActivity.class);
//                            intent.putExtra("id", String.valueOf(item.getId()));
//                            intent.putExtra("kind", String.valueOf(item.getGoods_kind()));
//                            context.startActivity(intent);
                        }
                    })
                    .setText(R.id.ry_tags, item.getGoods_describe());
            Glide.with(getContext()).load(item.getGoods_pic()).apply(new RequestOptions().transform(new GlideRoundTransform(context, 7))).into((ImageView) helper.getView(R.id.iv_cover));


        }
    }
}