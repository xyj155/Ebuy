package com.example.xuyijie.ebuyshop.presenter;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseObserver;
import com.example.xuyijie.ebuyshop.contract.HomeContract;
import com.example.xuyijie.ebuyshop.entity.HomeDataEntity;
import com.example.xuyijie.ebuyshop.gson.AdGson;
import com.example.xuyijie.ebuyshop.gson.BannerGson;
import com.example.xuyijie.ebuyshop.gson.HomeCardGson;
import com.example.xuyijie.ebuyshop.model.HomeModel;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/11/3.
 */

public class HomePresenter implements HomeContract.Presenter {
    private HomeModel homeModel = new HomeModel();
    private HomeContract.View view;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
    }

    @Override
    public void getHomeData(String location) {
        view.showLoading();
        Observable.zip(homeModel.getBannerList(location), homeModel.getHomeCard(location), new Func2<BaseGson<BannerGson>, BaseGson<HomeCardGson>, HomeDataEntity>() {
            @Override
            public HomeDataEntity call(BaseGson<BannerGson> bannerGsonBaseGson, BaseGson<HomeCardGson> goodGsonBaseGson) {
                return new HomeDataEntity(goodGsonBaseGson.getList(), bannerGsonBaseGson.getList());
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<HomeDataEntity>() {
                    @Override
                    public void onError(String error) {
                        view.hideLoading();
                        view.loadFailed(error);
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onNext(HomeDataEntity homeDataEntity) {
                        view.hideLoading();
                        view.loadHomeData(homeDataEntity.getBannerGsons(), homeDataEntity.getHomeCardGsons());
                    }
                });
    }

    @Override
    public void getAdBanner(String location) {
        homeModel.getAdBanner(location)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<BaseGson<AdGson>>() {
                    @Override
                    public void onError(String error) {
                        view.loadFailed(error);
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onNext(BaseGson<AdGson> adGsonBaseGson) {
                        if (adGsonBaseGson.isStatus()) {
                            view.loadAD(adGsonBaseGson.getList());
                        } else {
                            view.loadFailed(adGsonBaseGson.getMsg());
                        }
                    }
                });
    }
}
