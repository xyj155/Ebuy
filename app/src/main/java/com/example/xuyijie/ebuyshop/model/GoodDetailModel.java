package com.example.xuyijie.ebuyshop.model;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.contract.GoodDetailContract;
import com.example.xuyijie.ebuyshop.gson.GoodsDetailGson;
import com.example.xuyijie.ebuyshop.http.RetrofitUtil;

import rx.Observable;

/**
 * Created by Administrator on 2018/11/3.
 */

public class GoodDetailModel implements GoodDetailContract.Model {
    @Override
    public Observable<BaseGson<GoodsDetailGson>> getGoodsDetail(String uid, String goodId) {
        return RetrofitUtil.getInstance().getServerices().getGoodsDetail(uid,goodId);
    }
}
