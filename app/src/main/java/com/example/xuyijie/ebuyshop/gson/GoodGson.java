package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by 徐易杰 on 2018/11/1.
 */

public class GoodGson {

    public int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private List<String> kind;
    private List<GoodsBean> goods;

    public List<String> getKind() {
        return kind;
    }

    public void setKind(List<String> kind) {
        this.kind = kind;
    }

    public List<GoodsBean> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsBean> goods) {
        this.goods = goods;
    }

    public static class GoodsBean {
        private String comment;

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
private String goods_describe;

        public String getGoods_describe() {
            return goods_describe;
        }

        public void setGoods_describe(String goods_describe) {
            this.goods_describe = goods_describe;
        }

        /**
         * id : 100
         * goods_name : Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028
         * updatetime : 2018-11-10 11:08:39
         * kind : 手机
         * goods_pic : https://img.alicdn.com/imgextra/i1/2129855716/O1CN011s5yNnxIEaLUKuu_!!0-item_pic.jpg_430x430q90.jpg
         * goods_price : 109.01
         * goods_tags : 棉衣,双面
         * goods_kind : 手机
         * num : 3
         * goods_stock : 30
         * is_purse : 1
         * colorattr : 请选择产品颜色
         * color : ["深空灰","银色","白色","梦幻蓝","紫色","绿色","Snow","GhostWhite"]
         * sizeattr : 请选择产品大小
         * size : ["30GB","4GB","6GB","7GB","8GB","9GB","11GB"]
         * modelattr : 请选择产品属性
         * name : ["小米5s","小米mix2"]
         */
        private boolean isChoosed;
        private String post_free;

        public String getPost_free() {
            return post_free;
        }

        public void setPost_free(String post_free) {
            this.post_free = post_free;
        }

        public boolean isChoosed() {
            return isChoosed;
        }

        public void setChoosed(boolean choosed) {
            isChoosed = choosed;
        }

        private int id;
        private String goods_name;
        private String updatetime;
        private String kind;
        private String goods_pic;
        private double goods_price;
        private String goods_tags;
        private String goods_kind;
        private int num;
        private int goods_stock;
        private String is_purse;
        private String colorattr;
        private String sizeattr;
        private String modelattr;
        private List<String> color;
        private List<String> size;
        private List<String> name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getGoods_pic() {
            return goods_pic;
        }

        public void setGoods_pic(String goods_pic) {
            this.goods_pic = goods_pic;
        }

        public double getGoods_price() {
            return goods_price;
        }

        public void setGoods_price(double goods_price) {
            this.goods_price = goods_price;
        }

        public String getGoods_tags() {
            return goods_tags;
        }

        public void setGoods_tags(String goods_tags) {
            this.goods_tags = goods_tags;
        }

        public String getGoods_kind() {
            return goods_kind;
        }

        public void setGoods_kind(String goods_kind) {
            this.goods_kind = goods_kind;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getGoods_stock() {
            return goods_stock;
        }

        public void setGoods_stock(int goods_stock) {
            this.goods_stock = goods_stock;
        }

        public String getIs_purse() {
            return is_purse;
        }

        public void setIs_purse(String is_purse) {
            this.is_purse = is_purse;
        }

        public String getColorattr() {
            return colorattr;
        }

        public void setColorattr(String colorattr) {
            this.colorattr = colorattr;
        }

        public String getSizeattr() {
            return sizeattr;
        }

        public void setSizeattr(String sizeattr) {
            this.sizeattr = sizeattr;
        }

        public String getModelattr() {
            return modelattr;
        }

        public void setModelattr(String modelattr) {
            this.modelattr = modelattr;
        }

        public List<String> getColor() {
            return color;
        }

        public void setColor(List<String> color) {
            this.color = color;
        }

        public List<String> getSize() {
            return size;
        }

        public void setSize(List<String> size) {
            this.size = size;
        }

        public List<String> getName() {
            return name;
        }

        public void setName(List<String> name) {
            this.name = name;
        }
    }
}
