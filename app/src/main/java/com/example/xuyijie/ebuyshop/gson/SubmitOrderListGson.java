package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by Administrator on 2018/11/21.
 */

public class SubmitOrderListGson {

    /**
     * id : 4
     * shop_name : 花姐
     * belongs : 徐易杰
     * schoolname : 嘉兴学院
     * city : 嘉兴
     * updatetime : 2018-11-06 10:17:02
     * wx_id : x1789780841
     * location : 浙江省嘉兴学院梁林校区
     * shop_cover : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1541480669105&di=9a7256feaab76be348d948bfa47f387d&imgtype=0&src=http%3A%2F%2Fpic.qiantucdn.com%2F58pic%2F21%2F48%2F75%2F10g58PICW5D_1024.jpg
     * reputation : 3
     * banner : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542012724&di=3392b9f91cc8fe9e3eebf5ab1f377ee0&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01e25259a8c8f7a8012028a99fb154.jpg%402o.jpg
     * goods : [{"id":1388,"uid":1,"gid":109,"comment":"","addtime":"2018-11-18 20:59:43","is_buy":"1","s_id":4,"status":"1","express_name":null,"express_num":null,"address":null,"is_pay":null,"u_tel":null,"total_money":null,"goods_count":null,"c_id":1388,"num":1,"goods_name":"2盒包邮日本进口零食卡乐比薯条三兄弟淡盐原味/黄油酱烧休闲食品","goods_location":"嘉兴","goods_tags":"饼干,零食","goods_price":"23.66","goods_pic":"https://gd3.alicdn.com/imgextra/i2/0/TB1KclbXcfpK1RjSZFOXXa6nFXa_!!0-item_pic.jpg_400x400.jpg","goods_describe":"2盒包邮日本进口零食卡乐比薯条三兄弟淡盐原味/黄油酱烧休闲食品","goods_stock":"566","goods_owner":"4","updatetime":"2018-11-16 22:31:59","goods_kind":"化妆品","is_purse":null,"original_price":"6.00","post_free":"5.00"},{"id":1380,"uid":1,"gid":110,"comment":"","addtime":"2018-11-18 20:58:19","is_buy":"1","s_id":4,"status":"1","express_name":null,"express_num":null,"address":null,"is_pay":null,"u_tel":null,"total_money":null,"goods_count":null,"c_id":1380,"num":4,"goods_name":"日本进口小零食明治MEIJI杏仁/坚果夹心巧克力礼盒情人节礼物*4盒","goods_location":"嘉兴","goods_tags":"饼干,甜点","goods_price":"23.00","goods_pic":"https://gd3.alicdn.com/imgextra/i4/114595520/TB2sglQaWi5V1BjSspcXXcSrFXa_!!114595520.jpg_400x400.jpg","goods_describe":"日本进口小零食明治MEIJI杏仁/坚果夹心巧克力礼盒情人节礼物*4盒","goods_stock":"34","goods_owner":"4","updatetime":"2018-11-16 22:31:59","goods_kind":"运动","is_purse":null,"original_price":"6.00","post_free":"5.00"},{"id":1378,"uid":1,"gid":111,"comment":"","addtime":"2018-11-18 20:58:19","is_buy":"1","s_id":4,"status":"1","express_name":null,"express_num":null,"address":null,"is_pay":null,"u_tel":null,"total_money":null,"goods_count":null,"c_id":1378,"num":5,"goods_name":"高州林氏桂圆肉无核野生老树8A桂圆肉干无添加特级龙眼肉500g包邮","goods_location":"嘉兴","goods_tags":"果脯,干货,零食","goods_price":"45.00","goods_pic":"https://gd1.alicdn.com/imgextra/i1/416563969/O1CN011fBqRyr3ArOYC3F_!!416563969.jpg","goods_describe":"高州林氏桂圆肉无核野生老树8A桂圆肉干无添加特级龙眼肉500g包邮","goods_stock":"3444","goods_owner":"4","updatetime":"2018-11-16 22:31:59","goods_kind":"手机","is_purse":null,"original_price":"6.00","post_free":"5.00"}]
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
         * id : 1388
         * uid : 1
         * gid : 109
         * comment :
         * addtime : 2018-11-18 20:59:43
         * is_buy : 1
         * s_id : 4
         * status : 1
         * express_name : null
         * express_num : null
         * address : null
         * is_pay : null
         * u_tel : null
         * total_money : null
         * goods_count : null
         * c_id : 1388
         * num : 1
         * goods_name : 2盒包邮日本进口零食卡乐比薯条三兄弟淡盐原味/黄油酱烧休闲食品
         * goods_location : 嘉兴
         * goods_tags : 饼干,零食
         * goods_price : 23.66
         * goods_pic : https://gd3.alicdn.com/imgextra/i2/0/TB1KclbXcfpK1RjSZFOXXa6nFXa_!!0-item_pic.jpg_400x400.jpg
         * goods_describe : 2盒包邮日本进口零食卡乐比薯条三兄弟淡盐原味/黄油酱烧休闲食品
         * goods_stock : 566
         * goods_owner : 4
         * updatetime : 2018-11-16 22:31:59
         * goods_kind : 化妆品
         * is_purse : null
         * original_price : 6.00
         * post_free : 5.00
         */

        private int id;
        private int uid;
        private int gid;
        private String comment;
        private String addtime;
        private String is_buy;
        private int s_id;
        private String status;
        private Object express_name;
        private Object express_num;
        private Object address;
        private Object is_pay;
        private Object u_tel;
        private Object total_money;
        private Object goods_count;
        private int c_id;
        private int num;
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
        private Object is_purse;
        private String original_price;
        private String post_free;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public int getGid() {
            return gid;
        }

        public void setGid(int gid) {
            this.gid = gid;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getIs_buy() {
            return is_buy;
        }

        public void setIs_buy(String is_buy) {
            this.is_buy = is_buy;
        }

        public int getS_id() {
            return s_id;
        }

        public void setS_id(int s_id) {
            this.s_id = s_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getExpress_name() {
            return express_name;
        }

        public void setExpress_name(Object express_name) {
            this.express_name = express_name;
        }

        public Object getExpress_num() {
            return express_num;
        }

        public void setExpress_num(Object express_num) {
            this.express_num = express_num;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getIs_pay() {
            return is_pay;
        }

        public void setIs_pay(Object is_pay) {
            this.is_pay = is_pay;
        }

        public Object getU_tel() {
            return u_tel;
        }

        public void setU_tel(Object u_tel) {
            this.u_tel = u_tel;
        }

        public Object getTotal_money() {
            return total_money;
        }

        public void setTotal_money(Object total_money) {
            this.total_money = total_money;
        }

        public Object getGoods_count() {
            return goods_count;
        }

        public void setGoods_count(Object goods_count) {
            this.goods_count = goods_count;
        }

        public int getC_id() {
            return c_id;
        }

        public void setC_id(int c_id) {
            this.c_id = c_id;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
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

        public Object getIs_purse() {
            return is_purse;
        }

        public void setIs_purse(Object is_purse) {
            this.is_purse = is_purse;
        }

        public String getOriginal_price() {
            return original_price;
        }

        public void setOriginal_price(String original_price) {
            this.original_price = original_price;
        }

        public String getPost_free() {
            return post_free;
        }

        public void setPost_free(String post_free) {
            this.post_free = post_free;
        }

    }
}
