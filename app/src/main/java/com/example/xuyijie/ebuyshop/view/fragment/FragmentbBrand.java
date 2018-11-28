package com.example.xuyijie.ebuyshop.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.base.BaseFragment;
import com.example.xuyijie.ebuyshop.contract.BrandsContract;
import com.example.xuyijie.ebuyshop.gson.BrandsList;
import com.example.xuyijie.ebuyshop.presenter.BrandsPresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by 徐易杰 on 2018/11/23.
 */

public class FragmentbBrand extends BaseFragment implements BrandsContract.View {


    @InjectView(R.id.sl_brand)
    SmartRefreshLayout slBrand;
    @InjectView(R.id.ry_brand_purse)
    RecyclerView ryBrandPurse;
    @InjectView(R.id.ry_brands)
    RecyclerView ryBrands;
    private BrandsPresenter brandsPresenter = new BrandsPresenter(this);
    private BrandsCharacter brandsCharacter = new BrandsCharacter(null);

    @Override
    protected int setView() {
        return R.layout.fragment_brand;
    }

    @Override
    protected void init(View view) {

    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        slBrand.autoRefresh();
        slBrand.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                brandsPresenter.getBrandsList();
//                brandsPresenter.getBrandsClass();
            }
        });
        ryBrands.setLayoutManager(new LinearLayoutManager(getContext()));
        brandsCharacter.bindToRecyclerView(ryBrands);
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
        slBrand.finishRefresh();
    }

//    @Override
//    public void loadBrandsList(BrandsGson bannerGson) {
//        slBrand.finishRefresh();
//        Glide.with(getContext()).asBitmap().load(bannerGson.getBrand().get(4).getPic()).into(ivBrandHome);
//        Glide.with(getContext()).asBitmap().load(bannerGson.getBrand().get(5).getPic()).into(ivBrand1);
//        Glide.with(getContext()).asBitmap().load(bannerGson.getBrand().get(6).getPic()).into(ivBrand2);
//        Glide.with(getContext()).asBitmap().load(bannerGson.getBrand().get(7).getPic()).into(ivBrand3);
//    }

    private static final String TAG = "FragmentbBrand";

    @Override
    public void loadBrands(List<BrandsList> bannerGson) {
        slBrand.finishRefresh();
        brandsCharacter.replaceData(bannerGson);
        Log.i(TAG, "loadBrands: " + bannerGson);
    }



    private class BrandsCharacter extends BaseQuickAdapter<BrandsList, BaseViewHolder> {

        public BrandsCharacter(@Nullable List<BrandsList> data) {
            super(R.layout.ry_brands_header, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, BrandsList item) {
            helper.setText(R.id.tv_brand, item.getKey());
            RecyclerView ryBrand = helper.getView(R.id.ry_brands);
            ryBrand.setLayoutManager(new LinearLayoutManager(getContext()));
            BrandsListAdapter brandsListAdapter=new BrandsListAdapter(null);
            brandsListAdapter.replaceData(item.getList());
            ryBrand.setAdapter(brandsListAdapter);
        }
    }

    private class BrandsListAdapter extends BaseQuickAdapter<BrandsList.ListBean, BaseViewHolder> {

        public BrandsListAdapter(@Nullable List<BrandsList.ListBean> data) {
            super(R.layout.ry_brands_list, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, BrandsList.ListBean item) {
            helper.setText(R.id.tv_brand, item.getName());
        }


    }
}
