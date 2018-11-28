package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by Administrator on 2018/11/12.
 */

public class CouponGson {

        private List<KindsBean> kinds;
        private List<CouponBean> coupon;

        public List<KindsBean> getKinds() {
            return kinds;
        }

        public void setKinds(List<KindsBean> kinds) {
            this.kinds = kinds;
        }

        public List<CouponBean> getCoupon() {
            return coupon;
        }

        public void setCoupon(List<CouponBean> coupon) {
            this.coupon = coupon;
        }

        public static class KindsBean {
            /**
             * pic : null
             * name : icon_foods
             */

            private Object pic;
            private String name;

            public Object getPic() {
                return pic;
            }

            public void setPic(Object pic) {
                this.pic = pic;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class CouponBean {
            /**
             * id : 1
             * coupon_name :  满50减5元
             * coupon_monney : 30
             * coupon_starttime : 2018-11-06 10:10:35
             * coupon_endtime : 2018-11-12 10:10:27
             * shop_name : 欧尚
             * comment : 此优惠不可和满减，第二份半价同时使用
             * coupon_num : 100
             * location : 嘉兴市
             * shop_pic : https://ss0.bdstatic.com/-0U0bnSm1A5BphGlnYG/tam-ogel/26931ff58e10abb716c9070c966b43ee_121_121.jpg
             * shop_kind : icon_foods
             * kind_pic : null
             * is_dective : 0
             */

            private int id;
            private String coupon_name;
            private String coupon_monney;
            private String coupon_starttime;
            private String coupon_endtime;
            private String shop_name;
            private String comment;
            private int coupon_num;
            private String location;
            private String shop_pic;
            private String shop_kind;
            private Object kind_pic;
            private String is_dective;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCoupon_name() {
                return coupon_name;
            }

            public void setCoupon_name(String coupon_name) {
                this.coupon_name = coupon_name;
            }

            public String getCoupon_monney() {
                return coupon_monney;
            }

            public void setCoupon_monney(String coupon_monney) {
                this.coupon_monney = coupon_monney;
            }

            public String getCoupon_starttime() {
                return coupon_starttime;
            }

            public void setCoupon_starttime(String coupon_starttime) {
                this.coupon_starttime = coupon_starttime;
            }

            public String getCoupon_endtime() {
                return coupon_endtime;
            }

            public void setCoupon_endtime(String coupon_endtime) {
                this.coupon_endtime = coupon_endtime;
            }

            public String getShop_name() {
                return shop_name;
            }

            public void setShop_name(String shop_name) {
                this.shop_name = shop_name;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }

            public int getCoupon_num() {
                return coupon_num;
            }

            public void setCoupon_num(int coupon_num) {
                this.coupon_num = coupon_num;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getShop_pic() {
                return shop_pic;
            }

            public void setShop_pic(String shop_pic) {
                this.shop_pic = shop_pic;
            }

            public String getShop_kind() {
                return shop_kind;
            }

            public void setShop_kind(String shop_kind) {
                this.shop_kind = shop_kind;
            }

            public Object getKind_pic() {
                return kind_pic;
            }

            public void setKind_pic(Object kind_pic) {
                this.kind_pic = kind_pic;
            }

            public String getIs_dective() {
                return is_dective;
            }

            public void setIs_dective(String is_dective) {
                this.is_dective = is_dective;
            }
        }
}
