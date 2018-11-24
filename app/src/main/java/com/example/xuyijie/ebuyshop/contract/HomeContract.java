package com.example.xuyijie.ebuyshop.contract;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.BaseView;
import com.example.xuyijie.ebuyshop.gson.AdGson;
import com.example.xuyijie.ebuyshop.gson.BannerGson;
import com.example.xuyijie.ebuyshop.gson.HomeCardGson;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2018/11/3.
 */

public interface HomeContract {
    interface Model {
        Observable<BaseGson<BannerGson>> getBannerList(String location);
        Observable<BaseGson<HomeCardGson>> getHomeCard(String location);

        Observable<BaseGson<AdGson>> getAdBanner(String location);
    }

    interface View extends BaseView {
        void loadHomeData(List<BannerGson> bannerGsons, List<HomeCardGson> goodGsons);
        void loadAD(List<AdGson> gsons);
    }

    interface Presenter {
        void getHomeData(String location);

        void getAdBanner(String location);


    }
}
