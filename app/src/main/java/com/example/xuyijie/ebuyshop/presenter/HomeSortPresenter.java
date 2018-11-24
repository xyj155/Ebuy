package com.example.xuyijie.ebuyshop.presenter;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseObserver;
import com.example.xuyijie.ebuyshop.contract.HomeSortContract;
import com.example.xuyijie.ebuyshop.gson.GoodGson;
import com.example.xuyijie.ebuyshop.model.HomeSortModel;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 徐易杰 on 2018/11/1.
 */

public class HomeSortPresenter implements HomeSortContract.Presenter {
    private HomeSortContract.View view;
    private HomeSortModel homeSortModel = new HomeSortModel();

    public HomeSortPresenter(HomeSortContract.View view) {
        this.view = view;
    }

    @Override
    public void getGoodsListByLocation(String location,String kind,String uid) {
        view.showLoading();
        homeSortModel.getGoodsListByLocation(location,kind,uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<BaseGson<GoodGson>>() {
                    @Override
                    public void onError(String error) {
                        view.loadFailed(error);
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onNext(BaseGson<GoodGson> goodGsonBaseGson) {
                        view.hideLoading();
                        if (goodGsonBaseGson.isStatus()) {
                            view.loadGoodsList(goodGsonBaseGson.getData());
                        } else {
                            view.loadFailed(goodGsonBaseGson.getMsg());
                        }
                    }
                });
    }
}
