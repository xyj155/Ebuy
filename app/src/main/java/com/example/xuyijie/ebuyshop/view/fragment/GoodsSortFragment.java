package com.example.xuyijie.ebuyshop.view.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.adapter.TabPagerAdapter;
import com.example.xuyijie.ebuyshop.base.BaseFragment;
import com.example.xuyijie.ebuyshop.weight.CustomScrollViewPager;
import com.example.xuyijie.ebuyshop.weight.ScaleTransitionPagerTitleView;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.BezierPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Administrator on 2018/11/23.
 */

public class GoodsSortFragment extends BaseFragment {
    @InjectView(R.id.sort_tab)
    MagicIndicator sortTab;
    @InjectView(R.id.sort_vp)
    CustomScrollViewPager sortVp;
    private String[] title = {"分类", "店家", "热门"};

    @Override
    protected int setView() {
        return R.layout.fragment_goods_sort;
    }

    @Override
    protected void init(View view) {
        List<Fragment> fragments = new ArrayList<>();
        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(getChildFragmentManager(), fragments, title);
        fragments.add(new FragmentKind());
        fragments.add(new FragmentbBrand());
        fragments.add(new FragmentHot());
        sortVp.setAdapter(tabPagerAdapter);
        sortVp.setCurrentItem(0);
        sortTab.setBackgroundColor(Color.WHITE);
        CommonNavigator commonNavigator = new CommonNavigator(getContext());
//        commonNavigator.setAdjustMode(true);
        commonNavigator.setLeftPadding(50);
        commonNavigator.setRightPadding(50);
        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
            @Override
            public int getCount() {
                return title == null ? 0 : title.length;
            }

            @Override
            public IPagerTitleView getTitleView(Context context, final int index) {
                SimplePagerTitleView simplePagerTitleView = new ScaleTransitionPagerTitleView(context);
                simplePagerTitleView.setText(title[index]);
                simplePagerTitleView.setTextSize(18);
                simplePagerTitleView.setNormalColor(Color.GRAY);
                simplePagerTitleView.setSelectedColor(Color.BLACK);
                simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sortVp.setCurrentItem(index);
                    }
                });
                return simplePagerTitleView;
            }

            @Override
            public IPagerIndicator getIndicator(Context context) {
                BezierPagerIndicator indicator = new BezierPagerIndicator(context);
                indicator.setColors(Color.parseColor("#000000"), Color.parseColor("#000000"), Color.parseColor("#000000"), Color.parseColor("#000000"), Color.parseColor("#000000"));
                return indicator;
            }
        });
        sortTab.setNavigator(commonNavigator);
        ViewPagerHelper.bind(sortTab, sortVp);

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
}
