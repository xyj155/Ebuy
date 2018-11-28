package com.example.xuyijie.ebuyshop.view.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.base.BaseFragment;
import com.example.xuyijie.ebuyshop.weight.card.CardFragmentPagerAdapter;
import com.example.xuyijie.ebuyshop.weight.card.CardItem;
import com.example.xuyijie.ebuyshop.weight.card.CardPagerAdapter;
import com.example.xuyijie.ebuyshop.weight.card.ShadowTransformer;
import com.example.xuyijie.ebuyshop.weight.card.WrapContentHeightViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by 徐易杰 on 2018/11/23.
 */

public class FragmentHot extends BaseFragment {

    @InjectView(R.id.vp_hotgoods)
    WrapContentHeightViewPager vpHotgoods;
    @InjectView(R.id.ry_hot_goods)
    RecyclerView ryHotGoods;
    @InjectView(R.id.ry_hot)
    NestedScrollView ryHot;
    private TestAdapter adapter;
    private CardPagerAdapter mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;
    private CardFragmentPagerAdapter mFragmentCardAdapter;

    @Override
    protected int setView() {
        return R.layout.fragment_hot;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void init(View view) {
        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem("CES shutdown ", "测试数据"));
        mCardAdapter.addCardItem(new CardItem("CES shutdown ", "测试数据"));
        mCardAdapter.addCardItem(new CardItem("CES shutdown ", "测试数据"));
        mCardAdapter.addCardItem(new CardItem("CES shutdown ", "测试数据"));
        mFragmentCardAdapter = new CardFragmentPagerAdapter(getChildFragmentManager(),
                dpToPixels(2, getContext()));
        ryHotGoods.setNestedScrollingEnabled(false);
        mCardShadowTransformer = new ShadowTransformer(vpHotgoods, mCardAdapter);
        vpHotgoods.setAdapter(mCardAdapter);
        vpHotgoods.setPageTransformer(false, mCardShadowTransformer);
        vpHotgoods.setOffscreenPageLimit(3);
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            strings.add("测试" + i);
        }
        ryHotGoods.setLayoutManager(new LinearLayoutManager(getContext()));
//
        adapter = new TestAdapter(strings);
        ryHotGoods.setAdapter(adapter);
        ryHot.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                int[] outLocation = new int[2];
                vpHotgoods.getLocationInWindow(outLocation);
                int y = outLocation[1];
                if (y == 0) {
                    return;
                }
                int height = vpHotgoods.getHeight();
                float movy = scrollY - vpHotgoods.getHeight();
                float v1 = 1 + movy / height;
                vpHotgoods.setScaleY(1-v1);
                vpHotgoods.setScaleX(1-v1);
                vpHotgoods.setTranslationY(height / 2 * (v1));
            }
        });
//        ryHot.setOnScrollChangeListener(new View.OnScrollChangeListener() {
//            @Override
//            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                int[] outLocation = new int[2];
//                adapter.viewPager.getLocationInWindow(outLocation);
//                int y = outLocation[1];
//                if (y == 0) {
//                    return;
//                }
//                int height = adapter.viewPager.getHeight();
//                float movy = y - 151.0f;
//                float v1 = 1 + movy / height;
//                adapter.viewPager.setScaleY(v1);
//                adapter.viewPager.setScaleX(v1);
//                adapter.viewPager.setTranslationY(height / 2 * (1 - v1));
//            }
//        });

    }


    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
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

    private class TestAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

//        private ViewPager viewPager;

        public TestAdapter(@Nullable List<String> data) {
            super(R.layout.aixi_text, data);
//            header = new TextView(getContext());
//            header.setText("Aixi");
//            header.setGravity(Gravity.CENTER);
//              relativeLayout = new RelativeLayout(getContext());
//            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300));
//            relativeLayout.addView(header);
//            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 300);
//            params.addRule(RelativeLayout.CENTER_HORIZONTAL);
//            params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
//            header.setLayoutParams(params);
//            header.setBackgroundColor(0xffffff00);
//            relativeLayout.setBackgroundColor(0xffff0000);
//            RelativeLayout relativeLayout=new RelativeLayout(getContext());

//            viewPager = new ViewPager(getContext());
//
//            setHeaderView(viewPager, 0);
//            addItemType(0, R.layout.aixi_text);
        }

        @Override
        protected void convert(BaseViewHolder helper, String item) {
            helper.setText(R.id.text, item);
        }

//        @Override
//        protected void convert(BaseViewHolder helper, MultiItemEntity item) {
//            ContextEntity entity = (ContextEntity) item;
//            helper.setText(R.id.text, entity.str);
//        }
    }
//    private class TestAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
//
//        private ViewPager viewPager;
//
//        public TestAdapter(@Nullable List<MultiItemEntity> data) {
//            super(data);
////            header = new TextView(getContext());
////            header.setText("Aixi");
////            header.setGravity(Gravity.CENTER);
////              relativeLayout = new RelativeLayout(getContext());
////            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300));
////            relativeLayout.addView(header);
////            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 300);
////            params.addRule(RelativeLayout.CENTER_HORIZONTAL);
////            params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
////            header.setLayoutParams(params);
////            header.setBackgroundColor(0xffffff00);
////            relativeLayout.setBackgroundColor(0xffff0000);
////            RelativeLayout relativeLayout=new RelativeLayout(getContext());
//
//            viewPager = new ViewPager(getContext());
//
//            setHeaderView(viewPager, 0);
//            addItemType(0, R.layout.aixi_text);
//        }
//
//        @Override
//        protected void convert(BaseViewHolder helper, MultiItemEntity item) {
//            ContextEntity entity = (ContextEntity) item;
//            helper.setText(R.id.text, entity.str);
//        }
//    }

}
