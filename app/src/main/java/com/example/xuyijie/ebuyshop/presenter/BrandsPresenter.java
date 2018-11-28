package com.example.xuyijie.ebuyshop.presenter;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseObserver;
import com.example.xuyijie.ebuyshop.contract.BrandsContract;
import com.example.xuyijie.ebuyshop.gson.BrandsList;
import com.example.xuyijie.ebuyshop.model.BrandsModel;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class BrandsPresenter implements BrandsContract.Presenter {
    private BrandsContract.View view;
    private BrandsModel brandsModel = new BrandsModel();

    public BrandsPresenter(BrandsContract.View view) {
        this.view = view;
    }

    @Override
    public void getBrandsList() {
        view.showLoading();
        brandsModel.getBrandsList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<BaseGson<BrandsList>>() {
                    @Override
                    public void onError(String error) {
                        view.hideLoading();
                        view.loadFailed(error);
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onNext(BaseGson<BrandsList> brandsGsonBaseGson) {
                        view.hideLoading();
                        if (brandsGsonBaseGson.isStatus()) {
                            List<BrandsList> list = brandsGsonBaseGson.getList();
                            view.loadBrands(list);
                        } else {
                            view.loadFailed(brandsGsonBaseGson.getMsg());
                        }
                    }
                });
    }

//    @Override
//    public void getBrandsClass() {
//        view.showLoading();
//        brandsModel.getBrandsList()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new BaseObserver<BaseGson<BrandsList>>() {
//                    @Override
//                    public void onError(String error) {
//                        view.hideLoading();
//                        view.loadFailed(error);
//                    }
//
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onNext(BaseGson<BrandsList> brandsGsonBaseGson) {
//                        view.hideLoading();
//                        if (brandsGsonBaseGson.isStatus()) {
//                            view.loadBrands(brandsGsonBaseGson.getList());
//                        } else {
//                            view.loadFailed(brandsGsonBaseGson.getMsg());
//                        }
//                    }
//                });
//    }
}
