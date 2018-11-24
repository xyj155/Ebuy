package com.example.xuyijie.ebuyshop.contract;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseView;
import com.example.xuyijie.ebuyshop.gson.BrandsClassifyGson;
import com.example.xuyijie.ebuyshop.gson.BrandsGson;

import java.util.List;

import rx.Observable;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public interface BrandsContract {
    interface Model {
        Observable<BaseGson<BrandsGson>> getBrandsList(String location);

        Observable<BaseGson<BrandsClassifyGson>> getBrandsClass();
    }

    interface View extends BaseView {
        void loadBrandsList(BrandsGson bannerGson);
        void loadBrands(List<BrandsClassifyGson> bannerGson);
    }

    interface Presenter {
        void getBrandsList(String location);

        void getBrandsClass();
    }
}
