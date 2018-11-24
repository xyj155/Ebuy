package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by Administrator on 2018/11/14.
 */

public class UserShopCarGson {

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
         * goods : [{"id":101,"goods_name":"FILA斐乐女羽绒马甲2018冬季新品运动休闲轻质保暖连帽运动马夹女","goods_location":"嘉兴","goods_tags":"连帽","goods_price":"50.00","goods_pic":"https://img.alicdn.com/imgextra/i2/676606897/O1CN0120os8G5TgI2MfPQ_!!676606897.jpg_430x430q90.jpg","goods_describe":"FILA斐乐女羽绒马甲2018冬季新品运动休闲轻质保暖连帽运动马夹女","goods_stock":"166","goods_owner":"1","updatetime":"2018-11-08 12:14:33","goods_kind":"衣服","is_purse":"1","original_price":null,"num":1,"comment":""}]
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
        private List<GoodsBean> goods;

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

        public List<GoodsBean> getGoods() {
            return goods;
        }

        public void setGoods(List<GoodsBean> goods) {
            this.goods = goods;
        }

        public static class GoodsBean {
            /**
             * id : 101
             * goods_name : FILA斐乐女羽绒马甲2018冬季新品运动休闲轻质保暖连帽运动马夹女
             * goods_location : 嘉兴
             * goods_tags : 连帽
             * goods_price : 50.00
             * goods_pic : https://img.alicdn.com/imgextra/i2/676606897/O1CN0120os8G5TgI2MfPQ_!!676606897.jpg_430x430q90.jpg
             * goods_describe : FILA斐乐女羽绒马甲2018冬季新品运动休闲轻质保暖连帽运动马夹女
             * goods_stock : 166
             * goods_owner : 1
             * updatetime : 2018-11-08 12:14:33
             * goods_kind : 衣服
             * is_purse : 1
             * original_price : null
             * num : 1
             * comment :
             */
            private int isFirst;

            // true 表示商家选中 false 相反
            private boolean shopSelected;

            // true 表示 当前商品是选中的 false 相反
            private boolean itemSelected;

            public int getIsFirst() {
                return isFirst;
            }

            public void setIsFirst(int isFirst) {
                this.isFirst = isFirst;
            }

            public boolean isShopSelected() {
                return shopSelected;
            }

            public void setShopSelected(boolean shopSelected) {
                this.shopSelected = shopSelected;
            }

            public boolean isItemSelected() {
                return itemSelected;
            }

            public void setItemSelected(boolean itemSelected) {
                this.itemSelected = itemSelected;
            }

            public GoodsBean(int isFirst, boolean shopSelected, boolean itemSelected) {
                this.isFirst = isFirst;
                this.shopSelected = shopSelected;
                this.itemSelected = itemSelected;
            }

            private int id;
            private String goods_name;
            private String goods_location;
            private String goods_tags;
            private double goods_price;
            private String goods_pic;
            private String goods_describe;
            private String goods_stock;
            private int goods_owner;
            private String updatetime;
            private String goods_kind;
            private String is_purse;
            private Object original_price;
            private int num;
            private String comment;

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

            public double getGoods_price() {
                return goods_price;
            }

            public void setGoods_price(double goods_price) {
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

            public int getGoods_owner() {
                return goods_owner;
            }

            public void setGoods_owner(int goods_owner) {
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

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }
    }
}
