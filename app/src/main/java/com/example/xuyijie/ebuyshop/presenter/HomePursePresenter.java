package com.example.xuyijie.ebuyshop.presenter;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseObserver;
import com.example.xuyijie.ebuyshop.contract.HomePurseContract;
import com.example.xuyijie.ebuyshop.gson.GoodGson;
import com.example.xuyijie.ebuyshop.model.HomePurseModel;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class HomePursePresenter implements HomePurseContract.Presenter {
    private HomePurseModel homePurseModel = new HomePurseModel();
    private HomePurseContract.View view;

    public HomePursePresenter(HomePurseContract.View view) {
        this.view = view;
    }

    @Override
    public void getActiveList(String location) {
        homePurseModel.getActiveList(location)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<BaseGson<GoodGson.GoodsBean>>() {
                    @Override
                    public void onError(String error) {
                        view.loadFailed(error);
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onNext(BaseGson<GoodGson.GoodsBean> hotGoodsGsonBaseGson) {
                        if (hotGoodsGsonBaseGson.isStatus()) {
                            view.loadPurseGson(hotGoodsGsonBaseGson.getList());
                        } else {
                            view.loadFailed(hotGoodsGsonBaseGson.getMsg());
                        }
                    }
                });
    }

    @Override
    public void getDiscountList(String location) {
        homePurseModel.getDiscountList(location)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<BaseGson<GoodGson.GoodsBean>>() {
                    @Override
                    public void onError(String error) {
                        view.loadFailed(error);
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onNext(BaseGson<GoodGson.GoodsBean> hotGoodsGsonBaseGson) {
                        if (hotGoodsGsonBaseGson.isStatus()) {
                            view.loadDiscountGson(hotGoodsGsonBaseGson.getList());
                        } else {
                            view.loadFailed(hotGoodsGsonBaseGson.getMsg());
                        }
                    }
                });
    }
}
