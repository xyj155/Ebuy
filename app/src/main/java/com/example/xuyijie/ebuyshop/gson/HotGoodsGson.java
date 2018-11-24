package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by 徐易杰 on 2018/11/16.
 */

public class HotGoodsGson {
    /**
     * banner : http://img2.imgtn.bdimg.com/it/u=434138441,2884638957&fm=26&gp=0.jpg
     * goods : [{"id":1,"goods_name":"Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028","gods_price":"109.01","goods_pic":"https://img.alicdn.com/imgextra/i1/2129855716/O1CN011s5yNnxIEaLUKuu_!!0-item_pic.jpg_430x430q90.jpg","goods_kind":"手机","g_id":100},{"id":2,"goods_name":"FILA斐乐女羽绒马甲2018冬季新品运动休闲轻质保暖连帽运动马夹女","gods_price":"50.00","goods_pic":"https://img.alicdn.com/imgextra/i2/676606897/O1CN0120os8G5TgI2MfPQ_!!676606897.jpg_430x430q90.jpg","goods_kind":"手机","g_id":101},{"id":3,"goods_name":"【三只松鼠_碧根果210gx2】休闲零食坚果特产山核桃炒货长寿果","gods_price":"15.00","goods_pic":"https://img.alicdn.com/imgextra/i2/880734502/TB2B6SzvRjTBKNjSZFwXXcG4XXa_!!880734502.jpg_430x430q90.jpg","goods_kind":"手机","g_id":102},{"id":4,"goods_name":"孕妇装2018秋装新款韩版千鸟格甜美宽松时尚孕妇辣妈中长款背带裙","gods_price":"233.00","goods_pic":"https://gd1.alicdn.com/imgextra/i4/692459253/TB2SyNNc6DpK1RjSZFrXXa78VXa_!!692459253.jpg_400x400.jpg","goods_kind":"手机","g_id":103},{"id":5,"goods_name":"特惠清仓 Super制造 Adidas EQT BASK ADV 情侣休闲跑步鞋 CQ2996","gods_price":"14.00","goods_pic":"https://gd3.alicdn.com/imgextra/i3/410615257/TB2Pv0zaFyZBuNjt_jJXXbDlXXa_!!410615257.jpg","goods_kind":"手机","g_id":104},{"id":6,"goods_name":"Dell/戴尔 XPS13 XPS13-8508T XPS15 9560 4K高清电脑 美国版","gods_price":"1999.99","goods_pic":"https://gd3.alicdn.com/imgextra/i3/726566/TB2m3yxwgFkpuFjSspnXXb4qFXa_!!726566.jpg","goods_kind":"手机","g_id":105}]
     */

    private String banner;
    private List<GoodsBean> goods;
private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public List<GoodsBean> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsBean> goods) {
        this.goods = goods;
    }

    public static class GoodsBean {
        /**
         * id : 1
         * goods_name : Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028
         * gods_price : 109.01
         * goods_pic : https://img.alicdn.com/imgextra/i1/2129855716/O1CN011s5yNnxIEaLUKuu_!!0-item_pic.jpg_430x430q90.jpg
         * goods_kind : 手机
         * g_id : 100
         */

        private int id;
        private String goods_name;
        private String gods_price;
        private String goods_pic;
        private String goods_kind;
        private int g_id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGoods_name() {
            return goods_name;
        }
private String orignal_price;

        public String getOrignal_price() {
            return orignal_price;
        }

        public void setOrignal_price(String orignal_price) {
            this.orignal_price = orignal_price;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getGods_price() {
            return gods_price;
        }

        public void setGods_price(String gods_price) {
            this.gods_price = gods_price;
        }

        public String getGoods_pic() {
            return goods_pic;
        }

        public void setGoods_pic(String goods_pic) {
            this.goods_pic = goods_pic;
        }

        public String getGoods_kind() {
            return goods_kind;
        }

        public void setGoods_kind(String goods_kind) {
            this.goods_kind = goods_kind;
        }

        public int getG_id() {
            return g_id;
        }

        public void setG_id(int g_id) {
            this.g_id = g_id;
        }
    }
}
