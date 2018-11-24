package com.example.xuyijie.ebuyshop.view.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.adapter.TabPagerAdapter;
import com.example.xuyijie.ebuyshop.base.BaseFragment;
import com.example.xuyijie.ebuyshop.contract.HomeContract;
import com.example.xuyijie.ebuyshop.gson.AdGson;
import com.example.xuyijie.ebuyshop.gson.BannerGson;
import com.example.xuyijie.ebuyshop.gson.HomeCardGson;
import com.example.xuyijie.ebuyshop.presenter.HomePresenter;
import com.example.xuyijie.ebuyshop.weight.ScaleTransitionPagerTitleView;
import com.example.xuyijie.ebuyshop.weight.banner.AutoScrollViewPager;
import com.example.xuyijie.ebuyshop.weight.banner.BaseViewPagerAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

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

public class HomeFragment extends BaseFragment implements HomeContract.View {
    @InjectView(R.id.relativeLayout)
    RelativeLayout relativeLayout;
    @InjectView(R.id.banner_home)
    AutoScrollViewPager bannerHome;
    @InjectView(R.id.magic_indicator)
    MagicIndicator magicIndicator;
    @InjectView(R.id.view_pager)
    ViewPager viewPager;
    @InjectView(R.id.tv_active)
    TextView tvActive;
    @InjectView(R.id.iv_active)
    ImageView ivActive;
    @InjectView(R.id.tv_goods_select)
    TextView tvGoodsSelect;
    @InjectView(R.id.iv_goods_select)
    ImageView ivGoodsSelect;
    @InjectView(R.id.tv_brand_1)
    TextView tvBrand1;
    @InjectView(R.id.iv_brand_1)
    ImageView ivBrand1;
    @InjectView(R.id.tv_brand_2)
    TextView tvBrand2;
    @InjectView(R.id.iv_brand_2)
    ImageView ivBrand2;
    @InjectView(R.id.sl_home)
    SmartRefreshLayout slHome;
    @InjectView(R.id.sv_home)
    NestedScrollView svHome;
    private String[] title = {"最热", "折扣"};
    private HomePresenter homePresenter = new HomePresenter(this);
    private BaseViewPagerAdapter<BannerGson> mBaseViewPagerAdapter;

    @Override
    protected int setView() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init(View view) {
        ButterKnife.inject(this, view);
        List<Fragment> fragments = new ArrayList<>();
        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(getChildFragmentManager(), fragments, title);
        fragments.add(new HomeFragmentPurse());
        fragments.add(new HomeFragmentDiscount());
        viewPager.setAdapter(tabPagerAdapter);
        viewPager.setCurrentItem(0);
        magicIndicator.setBackgroundColor(Color.WHITE);
        CommonNavigator commonNavigator = new CommonNavigator(getContext());
        commonNavigator.setAdjustMode(true);
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
                        viewPager.setCurrentItem(index);
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
        magicIndicator.setNavigator(commonNavigator);
        ViewPagerHelper.bind(magicIndicator, viewPager);
        mBaseViewPagerAdapter = new BaseViewPagerAdapter<BannerGson>(getContext(), listener) {
            @Override
            public void loadImage(ImageView view, int position, BannerGson url) {
                Glide.with(getContext()).asBitmap().load(url.getImg_url()).into(view);
            }

            @Override
            public void setSubTitle(TextView textView, int position, BannerGson s) {

            }
        };
        bannerHome.setAdapter(mBaseViewPagerAdapter);
        svHome.scrollBy(0,0);
        svHome.scrollTo(0,0);

    }

    private BaseViewPagerAdapter.OnAutoViewPagerItemClickListener listener = new BaseViewPagerAdapter.OnAutoViewPagerItemClickListener<BannerGson>() {

        @Override
        public void onItemClick(int position, BannerGson url) {
//            Intent intent = new Intent(getContext(), WebViewActivity.class);
//            intent.putExtra("url",url.getWeb_url());
//            startActivity(intent);
        }
    };


    @Override
    protected void initData(Bundle savedInstanceState) {
        slHome.autoRefresh();
        slHome.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                homePresenter.getHomeData("嘉兴");
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

    @Override
    public void loadFailed(String msg) {

    }

    @Override
    public void loadHomeData(List<BannerGson> bannerGsons, List<HomeCardGson> goodGsons) {
        slHome.finishRefresh();
        List<BannerGson> data = new ArrayList<>();
        for (int i = 0; i < bannerGsons.size(); i++) {
            data.add(bannerGsons.get(i));
        }
        mBaseViewPagerAdapter.add(data);
        tvActive.setText(goodGsons.get(0).getName());
        tvGoodsSelect.setText(goodGsons.get(1).getName());
        tvBrand1.setText(goodGsons.get(2).getName());
        tvBrand2.setText(goodGsons.get(3).getName());
        Glide.with(getContext()).asBitmap().load(goodGsons.get(0).getPic()).into(ivActive);
        Glide.with(getContext()).asBitmap().load(goodGsons.get(1).getPic()).into(ivGoodsSelect);
        Glide.with(getContext()).asBitmap().load(goodGsons.get(2).getPic()).into(ivBrand1);
        Glide.with(getContext()).asBitmap().load(goodGsons.get(3).getPic()).into(ivBrand2);
    }

    @Override
    public void loadAD(List<AdGson> gsons) {

    }
}
