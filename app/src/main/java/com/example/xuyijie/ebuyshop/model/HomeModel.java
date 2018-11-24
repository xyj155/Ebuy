package com.example.xuyijie.ebuyshop.model;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.contract.HomeContract;
import com.example.xuyijie.ebuyshop.gson.AdGson;
import com.example.xuyijie.ebuyshop.gson.BannerGson;
import com.example.xuyijie.ebuyshop.gson.HomeCardGson;
import com.example.xuyijie.ebuyshop.http.RetrofitUtil;

import rx.Observable;

/**
 * Created by Administrator on 2018/11/3.
 */

public class HomeModel implements HomeContract.Model {
    @Override
    public Observable<BaseGson<BannerGson>> getBannerList(String location) {
        return RetrofitUtil.getInstance().getServerices().getBannerList(location);
    }

    @Override
    public Observable<BaseGson<HomeCardGson>> getHomeCard(String location) {
        return RetrofitUtil.getInstance().getServerices().getHomeCard(location);
    }



    @Override
    public Observable<BaseGson<AdGson>> getAdBanner(String location) {
        return RetrofitUtil.getInstance().getServerices().getADBanner(location);
    }
}
