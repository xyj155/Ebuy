package com.example.xuyijie.ebuyshop.model;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.contract.BrandsContract;
import com.example.xuyijie.ebuyshop.gson.BrandsList;
import com.example.xuyijie.ebuyshop.http.RetrofitUtil;

import rx.Observable;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class BrandsModel implements BrandsContract.Model {
//    @Override
//    public Observable<BaseGson<BrandsGson>> getBrandsPurse(String location) {
//        return RetrofitUtil.getInstance().getServerices().getBrandsPurse(location);
//    }

    @Override
    public Observable<BaseGson<BrandsList>> getBrandsList() {
        return RetrofitUtil.getInstance().getServerices().getBrandsList();
    }
}
