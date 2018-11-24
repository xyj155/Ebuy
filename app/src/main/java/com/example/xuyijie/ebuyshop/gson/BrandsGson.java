package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class BrandsGson {
    private List<ShopGson> shop;
    private List<HomeCardGson> brand;

    public List<ShopGson> getShop() {
        return shop;
    }

    public void setShop(List<ShopGson> shop) {
        this.shop = shop;
    }

    public List<HomeCardGson> getBrand() {
        return brand;
    }

    public void setBrand(List<HomeCardGson> brand) {
        this.brand = brand;
    }
}
