package com.example.xuyijie.ebuyshop.contract;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseView;
import com.example.xuyijie.ebuyshop.gson.GoodGson;

import java.util.List;

import rx.Observable;


/**
 * Created by 徐易杰 on 2018/11/24.
 */

public interface HomePurseContract {
    interface Model {
        Observable<BaseGson<GoodGson.GoodsBean>> getActiveList(String location);
    }

    interface View extends BaseView {
        void loadPurseGson(List<GoodGson.GoodsBean> loadPurseList);
        
    }

    interface Presenter {
        void getActiveList(String location);
    }
}
