package com.example.xuyijie.ebuyshop.contract;

import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseView;
import com.example.xuyijie.ebuyshop.gson.BrandsList;

import java.util.List;

import rx.Observable;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public interface BrandsContract {
    interface Model {
//        Observable<BaseGson<BrandsGson>> getBrandsPurse(String location);

        Observable<BaseGson<BrandsList>> getBrandsList();
    }

    interface View extends BaseView {
//        void loadBrandsList(BrandsGson bannerGson);
        void loadBrands(List<BrandsList> bannerGson);
    }

    interface Presenter {
//        void getBrandsList(String location);

        void getBrandsList();
    }
}
