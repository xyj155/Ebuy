package com.example.xuyijie.ebuyshop.view.fragment;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Administrator on 2018/11/23.
 */

public class HomeFragmentDiscount extends BaseFragment implements HomePurseContract.View {
    @InjectView(R.id.ry_purse)
    RecyclerView ryPurse;
    private HomePursePresenter homePursePresenter = new HomePursePresenter(this);
    private GoodsAdapter goodsAdapter = new GoodsAdapter(null, getContext());

    @Override
    protected int setView() {
        return R.layout.fragment_home_discount;
    }

    @Override
    protected void init(View view) {
        homePursePresenter.getDiscountList("嘉兴");
        ryPurse.setFocusable(false);
        ryPurse.setLayoutManager(new StaggeredGridLayoutManager( 2,StaggeredGridLayoutManager.VERTICAL));
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

    }

    @Override
    public void loadDiscountGson(List<GoodGson.GoodsBean> loadPurseList) {
        goodsAdapter.replaceData(loadPurseList);
        Log.i(TAG, "loadPurseGson: " + loadPurseList);
        goodsAdapter.getRandomHeight(loadPurseList);
        ryPurse.setAdapter(goodsAdapter);
    }


    private class GoodsAdapter extends BaseQuickAdapter<GoodGson.GoodsBean, BaseViewHolder> {
        private Context context;
        private List<Integer> mHeights;//装产出的随机数
        private List<GoodGson.GoodsBean> list = new ArrayList<>();

        public GoodsAdapter(@Nullable List<GoodGson.GoodsBean> data, Context context) {
            super(R.layout.ry_discount_goods_list_item, data);
            this.list = data;
            this.context = context;
//            if (list.size()>0){
//                for (int i = 0; i < list.size(); i++) {
//                    int height = new Random().nextInt(200) + 100;//[100,300)的随机数
//                    heightList.add(height);
//                }
//            }

        }
        public void getRandomHeight(List<GoodGson.GoodsBean> mList){
            mHeights = new ArrayList<>();
            for(int i=0; i < mList.size();i++){
                //随机的获取一个范围为200-600直接的高度
                mHeights.add((int)(300+Math.random()*200));
            }
        }


        @Override
        protected void convert(final BaseViewHolder helper, final GoodGson.GoodsBean item) {
            TextView tvOrignal = helper.getView(R.id.tv_orignal_price);
            tvOrignal.setText("原价："+item.getGoods_price());
            tvOrignal.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            helper.setText(R.id.tv_name, item.getGoods_name())
                    .setText(R.id.tv_price, "￥ "+ item.getGoods_price())
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
            ImageView view = (ImageView) helper.getView(R.id.iv_cover);
//            ViewGroup.LayoutParams params = view.getLayoutParams();
//            params.height = heightList.get(helper.getPosition());
            Glide.with(getContext()).load(item.getGoods_pic()).apply(new RequestOptions().transform(new GlideRoundTransform(context, 7))).into(view);

            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = mHeights.get(helper.getPosition());
            view.setLayoutParams(layoutParams);

        }
    }
}
