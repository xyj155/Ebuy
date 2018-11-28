package com.example.xuyijie.ebuyshop.presenter;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseObserver;
import com.example.xuyijie.ebuyshop.contract.GoodDetailContract;
import com.example.xuyijie.ebuyshop.gson.GoodsDetailGson;
import com.example.xuyijie.ebuyshop.model.GoodDetailModel;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/11/3.
 */

public class GoodDetailPresenter implements GoodDetailContract.Presenter {
    private GoodDetailModel model = new GoodDetailModel();
    private GoodDetailContract.View view;

    public GoodDetailPresenter(GoodDetailContract.View view) {
        this.view = view;
    }

    @Override
    public void getGoodsDetail(String uid, String goodId) {
        view.showLoading();
        model.getGoodsDetail(uid, goodId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<BaseGson<GoodsDetailGson>>() {
                    @Override
                    public void onError(String error) {
                        view.loadFailed(error);
                        view.hideLoading();
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onNext(BaseGson<GoodsDetailGson> commentGsonBaseGson) {
                        view.hideLoading();
                        if (commentGsonBaseGson.isStatus()) {
                            view.setGoodDetail(commentGsonBaseGson.getData());
                        } else {
                            view.loadFailed(commentGsonBaseGson.getMsg());
                        }
                    }
                });
    }


    private static final String TAG = "GoodDetailPresenter";
}
