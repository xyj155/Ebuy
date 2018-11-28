package com.example.xuyijie.ebuyshop.contract;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseView;
import com.example.xuyijie.ebuyshop.gson.GoodsDetailGson;

import rx.Observable;

/**
 * Created by Administrator on 2018/11/3.
 */

public interface GoodDetailContract {
    interface Model {
        Observable<BaseGson<GoodsDetailGson>> getGoodsDetail(String uid, String goodId);


    }

    interface View extends BaseView {
        void setGoodDetail(GoodsDetailGson commentGson);

    }

    interface Presenter {
        void getGoodsDetail(String uid, String goodId);

    }
}
