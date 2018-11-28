package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by Administrator on 2018/11/10.
 */

public class ExpressGson {
    /**
     * trace : [{"AcceptStation":"【广东省深圳市坂田公司】 取件人: 王银平 已收件","AcceptTime":"2018-10-21 19:50:51"},{"AcceptStation":"【广东省深圳市坂田公司】 已收件","AcceptTime":"2018-10-21 22:39:54"},{"AcceptStation":"【广东省深圳市坂田公司】 已打包","AcceptTime":"2018-10-21 22:41:41"},{"AcceptStation":"【广东省深圳市坂田公司】 已发出 下一站 【深圳转运中心】","AcceptTime":"2018-10-21 23:27:12"},{"AcceptStation":"【深圳转运中心】 已收入","AcceptTime":"2018-10-22 00:33:25"},{"AcceptStation":"【深圳转运中心】 已发出 下一站 【衡阳转运中心】","AcceptTime":"2018-10-22 00:34:56"},{"AcceptStation":"【衡阳转运中心】 已收入","AcceptTime":"2018-10-22 13:42:27"},{"AcceptStation":"【衡阳转运中心】 已发出 下一站 【湖南省株洲市攸县公司】","AcceptTime":"2018-10-22 13:46:34"},{"AcceptStation":"【湖南省株洲市攸县公司】 已收入","AcceptTime":"2018-10-23 07:50:53"},{"AcceptStation":"【湖南省株洲市攸县公司】 派件人: 彭武爱 派件中 派件员电话18973322410","AcceptTime":"2018-10-23 07:59:06"},{"AcceptStation":"客户 签收人: 他人代收存疑请电17352750629 已签收 感谢使用圆通速递，期待再次为您服务","AcceptTime":"2018-10-23 20:36:31"}]
     * num : 802190912646509796
     * state : 3
     * shipper : YTO
     * goods : [{"id":111,"goods_name":"高州林氏桂圆肉无核野生老树8A桂圆肉干无添加特级龙眼肉500g包邮","goods_location":"嘉兴","goods_tags":"果脯,干货,零食","goods_price":"45.00","goods_pic":"https://gd1.alicdn.com/imgextra/i1/416563969/O1CN011fBqRyr3ArOYC3F_!!416563969.jpg","goods_describe":"高州林氏桂圆肉无核野生老树8A桂圆肉干无添加特级龙眼肉500g包邮","goods_stock":"3444","goods_owner":"4","updatetime":"2018-11-10 11:08:45","goods_kind":"手机","is_purse":null,"original_price":null},{"id":112,"goods_name":"广式广味风味肠咸腊肠风干腊味香肠腊肉风味肠500g腊货特产腊味","goods_location":"嘉兴","goods_tags":"零食,果脯,甜点","goods_price":"45.88","goods_pic":"https://gd3.alicdn.com/imgextra/i3/302103696/TB2CK2WcwjN8KJjSZFkXXaboXXa_!!302103696.jpg","goods_describe":"广式广味风味肠咸腊肠风干腊味香肠腊肉风味肠500g腊货特产腊味","goods_stock":"23","goods_owner":"5","updatetime":"2018-11-10 11:08:45","goods_kind":"衣服","is_purse":null,"original_price":null},{"id":113,"goods_name":"甩脂机抖抖机懒人家用运动瘦身器材震动燃脂减肥瘦肚子瘦腿仪器","goods_location":"嘉兴","goods_tags":"机械,运,减肥","goods_price":"34.88","goods_pic":"https://gd1.alicdn.com/imgextra/i1/3339030434/O1CN011F4oMDDQ78OfHD0_!!3339030434.jpg","goods_describe":"甩脂机抖抖机懒人家用运动瘦身器材震动燃脂减肥瘦肚子瘦腿仪器","goods_stock":"15","goods_owner":"5","updatetime":"2018-11-10 11:08:45","goods_kind":"icon_shose","is_purse":null,"original_price":null}]
     */

    private String num;
    private String state;
    private String shipper;
    private List<TraceBean> trace;
    private List<GoodGson.GoodsBean> goods;
    private String fromGeo;
    private String toGeo;
private String  com;

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getFromGeo() {
        return fromGeo;
    }

    public void setFromGeo(String fromGeo) {
        this.fromGeo = fromGeo;
    }

    public String getToGeo() {
        return toGeo;
    }

    public void setToGeo(String toGeo) {
        this.toGeo = toGeo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public List<TraceBean> getTrace() {
        return trace;
    }

    public void setTrace(List<TraceBean> trace) {
        this.trace = trace;
    }

    public List<GoodGson.GoodsBean> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodGson.GoodsBean> goods) {
        this.goods = goods;
    }

    public static class TraceBean {
        /**
         * AcceptStation : 【广东省深圳市坂田公司】 取件人: 王银平 已收件
         * AcceptTime : 2018-10-21 19:50:51
         */

        private String AcceptStation;
        private String AcceptTime;

        public String getAcceptStation() {
            return AcceptStation;
        }

        public void setAcceptStation(String AcceptStation) {
            this.AcceptStation = AcceptStation;
        }

        public String getAcceptTime() {
            return AcceptTime;
        }

        public void setAcceptTime(String AcceptTime) {
            this.AcceptTime = AcceptTime;
        }
    }


}
