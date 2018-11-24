package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

public class SecondHandGson {

    private List<String> kind;
    private List<ListBean> list;

    public List<String> getKind() {
        return kind;
    }

    public void setKind(List<String> kind) {
        this.kind = kind;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * id : 1
         * goods_name : Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028
         * goods_price : 200.45
         * location : 嘉兴
         * user_id : 12
         * kind : 化妆品
         * pic : https://img.alicdn.com/imgextra/i1/2129855716/O1CN011s5yNnxIEaLUKuu_!!0-item_pic.jpg_430x430q90.jpg
         * username : 1235645123
         * is_verify : null
         */

        private int id;
        private String goods_name;
        private double goods_price;
        private String location;
        private int user_id;
        private String kind;
        private String pic;
        private String username;
        private Object is_verify;

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

        public double getGoods_price() {
            return goods_price;
        }

        public void setGoods_price(double goods_price) {
            this.goods_price = goods_price;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Object getIs_verify() {
            return is_verify;
        }

        public void setIs_verify(Object is_verify) {
            this.is_verify = is_verify;
        }
    }

}