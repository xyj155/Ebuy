package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by Administrator on 2018/11/3.
 */

public class GoodsDetailGson {
    /**
     * goods : {"id":100,"goods_name":"Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028","goods_location":"嘉兴","goods_tags":"棉衣,双面","goods_price":"109.01","goods_pic":"https://img.alicdn.com/imgextra/i1/2129855716/O1CN011s5yNnxIEaLUKuu_!!0-item_pic.jpg_430x430q90.jpg","goods_describe":"Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028","goods_stock":"30","goods_owner":"1","updatetime":"2018-11-08 12:14:32","goods_kind":"衣服","is_purse":"1","original_price":null}
     * comment : []
     * color : ["深空灰","银色","白色","梦幻蓝","紫色","绿色","Snow","GhostWhite"]
     * size : ["30GB","4GB","6GB","7GB","8GB","9GB","11GB"]
     * name : ["小米5s","小米mix2"]
     */

    private GoodsBean goods;
    private List<CommentBean> comment;
    private List<String> color;
    private List<String> size;
    private List<String> name;
    private String colorattr;
    private boolean collection;

    public boolean isCollection() {
        return collection;
    }

    public void setCollection(boolean collection) {
        this.collection = collection;
    }

    private String sizeattr;

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

    private String modelattr;

    public GoodsBean getGoods() {
        return goods;
    }

    public void setGoods(GoodsBean goods) {
        this.goods = goods;
    }

    public List<CommentBean> getComment() {
        return comment;
    }

    public void setComment(List<CommentBean> comment) {
        this.comment = comment;
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

    public static class GoodsBean {
        /**
         * id : 100
         * goods_name : Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028
         * goods_location : 嘉兴
         * goods_tags : 棉衣,双面
         * goods_price : 109.01
         * goods_pic : https://img.alicdn.com/imgextra/i1/2129855716/O1CN011s5yNnxIEaLUKuu_!!0-item_pic.jpg_430x430q90.jpg
         * goods_describe : Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028
         * goods_stock : 30
         * goods_owner : 1
         * updatetime : 2018-11-08 12:14:32
         * goods_kind : 衣服
         * is_purse : 1
         * original_price : null
         */

        private int id;
        private String goods_name;
        private String goods_location;
        private String goods_tags;
        private String goods_price;
        private String goods_pic;
        private String goods_describe;
        private String goods_stock;
        private String goods_owner;
        private String updatetime;
        private String goods_kind;
        private String is_purse;
        private Object original_price;
        private List<String> picture;

        public List<String> getPicture() {
            return picture;
        }

        public void setPicture(List<String> picture) {
            this.picture = picture;
        }

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

        public String getGoods_location() {
            return goods_location;
        }

        public void setGoods_location(String goods_location) {
            this.goods_location = goods_location;
        }

        public String getGoods_tags() {
            return goods_tags;
        }

        public void setGoods_tags(String goods_tags) {
            this.goods_tags = goods_tags;
        }

        public String getGoods_price() {
            return goods_price;
        }

        public void setGoods_price(String goods_price) {
            this.goods_price = goods_price;
        }

        public String getGoods_pic() {
            return goods_pic;
        }

        public void setGoods_pic(String goods_pic) {
            this.goods_pic = goods_pic;
        }

        public String getGoods_describe() {
            return goods_describe;
        }

        public void setGoods_describe(String goods_describe) {
            this.goods_describe = goods_describe;
        }

        public String getGoods_stock() {
            return goods_stock;
        }

        public void setGoods_stock(String goods_stock) {
            this.goods_stock = goods_stock;
        }

        public String getGoods_owner() {
            return goods_owner;
        }

        public void setGoods_owner(String goods_owner) {
            this.goods_owner = goods_owner;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getGoods_kind() {
            return goods_kind;
        }

        public void setGoods_kind(String goods_kind) {
            this.goods_kind = goods_kind;
        }

        public String getIs_purse() {
            return is_purse;
        }

        public void setIs_purse(String is_purse) {
            this.is_purse = is_purse;
        }

        public Object getOriginal_price() {
            return original_price;
        }

        public void setOriginal_price(Object original_price) {
            this.original_price = original_price;
        }
    }

//
//
//    /**
//     * goods : {"id":1,"goods_name":"Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028","goods_location":"嘉兴","goods_tags":"棉衣,双面","goods_price":"109.01","goods_pic":"https://img.alicdn.com/imgextra/i1/2129855716/O1CN011s5yNnxIEaLUKuu_!!0-item_pic.jpg_430x430q90.jpg","goods_describe":"Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028","goods_stock":"30","goods_owner":"徐易杰","updatetime":"2018-11-03 11:42:15","goods_kind":"衣服","is_purse":"1"}
//     * comment : [{"id":1,"goods_id":"1","user_id":12,"comment":"好吃，还可以,挺好吃","createtime":"2018-11-03 11:49:37"},{"id":2,"goods_id":"1","user_id":17,"comment":"用户自动好评","createtime":"2018-11-03 11:49:37"}]
//     */
//
//    private GoodGson.GoodsBean goods;
//    private List<CommentBean> comment;
//
//    public GoodGson.GoodsBean getGoods() {
//        return goods;
//    }
//
//    public void setGoods(GoodGson.GoodsBean goods) {
//        this.goods = goods;
//    }
//
//    public List<CommentBean> getComment() {
//        return comment;
//    }
//
//    public void setComment(List<CommentBean> comment) {
//        this.comment = comment;
//    }
//
//
//
    public static class CommentBean {

        /**
         * username : 123
         * comment : 好吃，还可以,挺好吃
         */

        private String username;
        private String comment;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }
    private ShopBean shop;

    public ShopBean getShop() {
        return shop;
    }

    public void setShop(ShopBean shop) {
        this.shop = shop;
    }

    public static class ShopBean {
        /**
         * id : 1
         * shop_name : 海澜之家
         * belongs : 徐易杰
         * schoolname : 嘉兴学院
         * city : 嘉兴
         * updatetime : 2018-11-06 10:16:36
         * wx_id : x1789780841
         * location : 浙江省嘉兴学院梁林校区
         * shop_cover : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542075380&di=8a84bd92041179f9281202f5930cf2e0&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.uimaker.com%2Fuploads%2Fuserup%2F0%2F150243b48-O33.jpg
         * reputation : 3
         * banner : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542012724&di=3392b9f91cc8fe9e3eebf5ab1f377ee0&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01e25259a8c8f7a8012028a99fb154.jpg%402o.jpg
         */

        private int id;
        private String shop_name;
        private String belongs;
        private String schoolname;
        private String city;
        private String updatetime;
        private String wx_id;
        private String location;
        private String shop_cover;
        private String reputation;
        private String banner;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getShop_name() {
            return shop_name;
        }

        public void setShop_name(String shop_name) {
            this.shop_name = shop_name;
        }

        public String getBelongs() {
            return belongs;
        }

        public void setBelongs(String belongs) {
            this.belongs = belongs;
        }

        public String getSchoolname() {
            return schoolname;
        }

        public void setSchoolname(String schoolname) {
            this.schoolname = schoolname;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getWx_id() {
            return wx_id;
        }

        public void setWx_id(String wx_id) {
            this.wx_id = wx_id;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getShop_cover() {
            return shop_cover;
        }

        public void setShop_cover(String shop_cover) {
            this.shop_cover = shop_cover;
        }

        public String getReputation() {
            return reputation;
        }

        public void setReputation(String reputation) {
            this.reputation = reputation;
        }

        public String getBanner() {
            return banner;
        }

        public void setBanner(String banner) {
            this.banner = banner;
        }

    }
}

