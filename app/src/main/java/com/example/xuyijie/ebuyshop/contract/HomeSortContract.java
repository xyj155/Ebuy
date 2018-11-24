package com.example.xuyijie.ebuyshop.contract;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseView;
import com.example.xuyijie.ebuyshop.gson.GoodGson;

import rx.Observable;

/**
 * Created by 徐易杰 on 2018/11/1.
 */

public interface HomeSortContract {
    interface Model {
        Observable<BaseGson<GoodGson>> getGoodsListByLocation(String location, String kind, String uid);
    }

    interface View extends BaseView {
        void loadGoodsList(GoodGson goodGson);
    }

    interface Presenter {
        void getGoodsListByLocation(String location, String kind, String uid);
    }
}
