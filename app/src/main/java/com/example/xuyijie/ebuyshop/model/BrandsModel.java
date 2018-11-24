package com.example.xuyijie.ebuyshop.model;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.contract.BrandsContract;
import com.example.xuyijie.ebuyshop.gson.BrandsClassifyGson;
import com.example.xuyijie.ebuyshop.gson.BrandsGson;
import com.example.xuyijie.ebuyshop.http.RetrofitUtil;

import rx.Observable;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class BrandsModel implements BrandsContract.Model {
    @Override
    public Observable<BaseGson<BrandsGson>> getBrandsList(String location) {
        return RetrofitUtil.getInstance().getServerices().getBrandsList(location);
    }

    @Override
    public Observable<BaseGson<BrandsClassifyGson>> getBrandsClass() {
        return RetrofitUtil.getInstance().getServerices().getBrands();
    }
}
