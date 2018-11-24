package com.example.xuyijie.ebuyshop.model;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.contract.HomeSortContract;
import com.example.xuyijie.ebuyshop.gson.GoodGson;
import com.example.xuyijie.ebuyshop.http.RetrofitUtil;

import rx.Observable;

/**
 * Created by 徐易杰 on 2018/11/1.
 */

public class HomeSortModel implements HomeSortContract.Model {
    @Override
    public Observable<BaseGson<GoodGson>> getGoodsListByLocation(String location, String kind, String uid) {
        return RetrofitUtil.getInstance().getServerices().getGoodsListByLocation(location,kind,uid);
    }
}
