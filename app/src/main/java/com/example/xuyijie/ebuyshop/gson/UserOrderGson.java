package com.example.xuyijie.ebuyshop.gson;

/**
 * Created by Administrator on 2018/11/17.
 */

public class UserOrderGson {

    /**
     * id : 72
     * goods_id : 100
     * user_id : 1
     * g_infor : 种类：苹果6 颜色：WhiteSmoke 属性：12GB
     * goods_count : 1
     * total_money : 200.000
     * status : 1
     * express_name : null
     * express_num : null
     * time : 2018-11-17 17:57:42
     */

    private int id;
    private int goods_id;
    private int user_id;
    private String g_infor;
    private int goods_count;
    private String total_money;
    private int status;
    private Object express_name;
    private Object express_num;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getG_infor() {
        return g_infor;
    }

    public void setG_infor(String g_infor) {
        this.g_infor = g_infor;
    }

    public int getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(int goods_count) {
        this.goods_count = goods_count;
    }

    public String getTotal_money() {
        return total_money;
    }

    public void setTotal_money(String total_money) {
        this.total_money = total_money;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
