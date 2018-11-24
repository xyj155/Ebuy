package com.example.xuyijie.ebuyshop.gson;

/**
 * Created by Administrator on 2018/11/10.
 */

public class GoodsPrice {

    /**
     * pro_price : 500.12
     * pro_num : 100
     */

    private double pro_price;
    private int pro_num;
    private String pro_pic;

    public String getPro_pic() {
        return pro_pic;
    }

    public void setPro_pic(String pro_pic) {
        this.pro_pic = pro_pic;
    }

    public double getPro_price() {
        return pro_price;
    }

    public void setPro_price(double pro_price) {
        this.pro_price = pro_price;
    }

    public int getPro_num() {
        return pro_num;
    }

    public void setPro_num(int pro_num) {
        this.pro_num = pro_num;
    }

    @Override
    public String toString() {
        return "GoodsPrice{" +
                "pro_price=" + pro_price +
                ", pro_num=" + pro_num +
                ", pro_pic='" + pro_pic + '\'' +
                '}';
    }
}
