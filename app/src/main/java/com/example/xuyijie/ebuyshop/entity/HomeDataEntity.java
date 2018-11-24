package com.example.xuyijie.ebuyshop.entity;

import com.example.xuyijie.ebuyshop.gson.BannerGson;
import com.example.xuyijie.ebuyshop.gson.HomeCardGson;

import java.util.List;

/**
 * Created by Administrator on 2018/11/3.
 */

public class HomeDataEntity {
 private List<HomeCardGson> homeCardGsons;
    private List<BannerGson> bannerGsons;

    public HomeDataEntity(List<HomeCardGson> homeCardGsons, List<BannerGson> bannerGsons) {
        this.homeCardGsons = homeCardGsons;
        this.bannerGsons = bannerGsons;
    }

    public List<HomeCardGson> getHomeCardGsons() {
        return homeCardGsons;
    }

    public void setHomeCardGsons(List<HomeCardGson> homeCardGsons) {
        this.homeCardGsons = homeCardGsons;
    }

    public List<BannerGson> getBannerGsons() {
        return bannerGsons;
    }

    public void setBannerGsons(List<BannerGson> bannerGsons) {
        this.bannerGsons = bannerGsons;
    }
}
