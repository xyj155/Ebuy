package com.example.xuyijie.ebuyshop.model;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.contract.HomePurseContract;
import com.example.xuyijie.ebuyshop.gson.GoodGson;
import com.example.xuyijie.ebuyshop.http.RetrofitUtil;

import rx.Observable;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class HomePurseModel implements HomePurseContract.Model {
    @Override
    public Observable<BaseGson<GoodGson.GoodsBean>> getActiveList(String location) {
        return RetrofitUtil.getInstance().getServerices().getActiveList(location);
    }
}
