package com.example.xuyijie.ebuyshop.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.transition.AutoTransition;
import android.support.transition.TransitionManager;
import android.support.transition.TransitionSet;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.example.xuyijie.ebuyshop.view.activity.GoodsListActivity;
import com.example.xuyijie.ebuyshop.weight.MyViewPager;
import com.example.xuyijie.ebuyshop.weight.ScaleTransitionPagerTitleView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;
import com.zhouwei.mzbanner.holder.MZViewHolder;

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
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/11/23.
 */

public class HomeFragment extends BaseFragment implements HomeContract.View {


    //    @InjectView(R.id.tool_bar)
//    Toolbar toolBar;
//    @InjectView(R.id.collapsing_toolbar)
//    CollapsingToolbarLayout collapsingToolbar;
//    @InjectView(R.id.appbar_layout)
//    AppBarLayout appbarLayout;

    @InjectView(R.id.tv_bag)
    TextView tvBag;
    @InjectView(R.id.tv_beauty)
    TextView tvBeauty;
    @InjectView(R.id.tv_clothes)
    TextView tvClothes;
    @InjectView(R.id.tv_ornament)
    TextView tvOrnament;
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
    @InjectView(R.id.magic_indicator)
    MagicIndicator magicIndicator;
    @InjectView(R.id.view_pager)
    MyViewPager viewPager;
    @InjectView(R.id.sv_home)
    NestedScrollView svHome;
    @InjectView(R.id.sl_home)
    SmartRefreshLayout slHome;
    @InjectView(R.id.iv_search)
    ImageView ivSearch;

    @InjectView(R.id.tv_digital)
    TextView tvDigital;
    @InjectView(R.id.banner)
    MZBannerView banner;
    @InjectView(R.id.tv_search)
    TextView tvSearch;
    @InjectView(R.id.ll_search)
    LinearLayout llSearch;
    @InjectView(R.id.toolbar)
    RelativeLayout toolbar;
    @InjectView(R.id.tv_home)
    TextView tvHome;
    private String[] title = {"最热", "折扣"};
    private HomePresenter homePresenter = new HomePresenter(this);
    boolean isExpand = false;
    private TransitionSet mSet;

    @Override
    protected int setView() {
        return R.layout.fragment_home;
    }

    private void expand() {
        //设置伸展状态时的布局
        tvSearch.setText("搜索你想要的商品");
        RelativeLayout.LayoutParams LayoutParams = (RelativeLayout.LayoutParams) llSearch.getLayoutParams();
        LayoutParams.width = LayoutParams.MATCH_PARENT;
        LayoutParams.setMargins(dip2px(10), dip2px(10), dip2px(10), dip2px(10));
        llSearch.setLayoutParams(LayoutParams);
        //开始动画
        beginDelayedTransition(llSearch);
    }

    private void reduce() {
        //设置收缩状态时的布局
        tvSearch.setText("搜索");
        RelativeLayout.LayoutParams LayoutParams = (RelativeLayout.LayoutParams) llSearch.getLayoutParams();
        LayoutParams.width = dip2px(80);
        LayoutParams.setMargins(dip2px(10), dip2px(10), dip2px(10), dip2px(10));
        llSearch.setLayoutParams(LayoutParams);
        //开始动画
        beginDelayedTransition(llSearch);
    }

    void beginDelayedTransition(ViewGroup view) {
        mSet = new AutoTransition();
        mSet.setDuration(300);
        TransitionManager.beginDelayedTransition(view, mSet);
    }

    private int dip2px(float dpVale) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpVale * scale + 0.5f);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
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
        svHome.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                changeToolbarAlpha();
                if (svHome.getScrollY() >= banner.getHeight() - toolbar.getHeight() && !isExpand) {
                    expand();
                    isExpand = true;
                } else if (svHome.getScrollY() <= 0 && isExpand) {
                    reduce();
                    isExpand = false;
                }
                int[] searchOutLocation = new int[2];
                ivSearch.getLocationInWindow(searchOutLocation);
                tvHome.getLocationInWindow(searchOutLocation);
                int searchy = searchOutLocation[1];
                if (searchy == 0) {
                    return;
                }
                int searchheight = ivSearch.getHeight();
                int homeheight = tvHome.getHeight();
                float ivSearchovy = scrollY - ivSearch.getHeight();
                float tvHomeF = scrollY - tvHome.getHeight();
                float searchv1 = 1 + ivSearchovy / searchheight;
                float searchvhome = 1 + tvHomeF / homeheight;
                ivSearch.setScaleY((1 - searchv1) > 0 ? (1 - searchv1) : 0);
                tvHome.setScaleX((1 - searchvhome) > 0 ? (1 - searchvhome) : 0);
            }
        });
    }

    private void changeToolbarAlpha() {
        int scrollY = svHome.getScrollY();
        //快速下拉会引起瞬间scrollY<0
        if (scrollY <= 0) {
            toolbar.getBackground().mutate().setAlpha(1);

            return;
        }
        //计算当前透明度比率
        float radio = Math.min(1, scrollY / (banner.getHeight() - toolbar.getHeight() * 1f));
        //设置透明度
        toolbar.getBackground().mutate().setAlpha((int) (radio * 0xFF));
    }

    private static final String TAG = "HomeFragment";


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

    public static class BannerViewHolder implements MZViewHolder<String> {
        private ImageView mImageView;

        @Override
        public View createView(Context context) {
            // 返回页面布局
            View view = LayoutInflater.from(context).inflate(R.layout.banner_item, null);
            mImageView = (ImageView) view.findViewById(R.id.image);
            return view;
        }

        @Override
        public void onBind(Context context, int position, String data) {
            // 数据绑定
//            mImageView.setImageResource(data);
            Glide.with(context).asBitmap().load(data).into(mImageView);
        }
    }

    @Override
    public void loadHomeData(List<BannerGson> bannerGsons, List<HomeCardGson> goodGsons) {
        slHome.finishRefresh();
        List<String> data = new ArrayList<>();
        for (int i = 0; i < bannerGsons.size(); i++) {
            data.add(bannerGsons.get(i).getImg_url());
        }
        banner.setPages(data, new MZHolderCreator() {
            @Override
            public MZViewHolder createViewHolder() {
                return new BannerViewHolder();
            }
        });
        banner.start();

//        mBaseViewPagerAdapter.add(data);
        //设置图片集合
//        bannerHome.setImages(data);
//        //banner设置方法全部调用完毕时最后调用
//        bannerHome.start();
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

    @Override
    public void onPause() {
        super.onPause();
        banner.pause();//暂停轮播
    }

    //    @Override
//    public void onResume() {
//        super.onResume();
//        banner.start();//开始轮播
//    }
    @OnClick({R.id.tv_digital, R.id.tv_bag, R.id.tv_beauty, R.id.tv_clothes, R.id.tv_ornament})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_digital:
                startActivity(new Intent(getContext(), GoodsListActivity.class));
                break;
            case R.id.tv_bag:
                break;
            case R.id.tv_beauty:
                break;
            case R.id.tv_clothes:
                break;
            case R.id.tv_ornament:
                break;
        }
    }
}
