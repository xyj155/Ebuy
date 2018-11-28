package com.example.xuyijie.ebuyshop.base;

import java.util.List;

/**
 * Created by Xuyijie on 2018/10/16.
 */

public class BaseGson<T> {


    /**
     * status : true
     * code : 200
     * msg : 查询成功
     * data : {"kind":{"0":"衣服","2":"icon_foods"},"goods":[{"id":1,"goods_name":"Skechers斯凯奇男子新款梭织羽绒背心 实用双面穿马甲SMAMW18E028","goods_location":"嘉兴","goods_tags":"棉衣,双面","goods_price":"999.01","goods_pic":"https://img.alicdn.com/imgextra/i1/2129855716/O1CN011s5yNnxIEaLUKuu_!!0-item_pic.jpg_430x430q90.jpg","goods_describe":"双面可穿,时尚休闲","goods_stock":"30","goods_owner":"徐易杰","updatetime":"2018-11-01 18:47:15","goods_kind":"衣服"},{"id":2,"goods_name":"FILA斐乐女羽绒马甲2018冬季新品运动休闲轻质保暖连帽运动马夹女","goods_location":"嘉兴","goods_tags":"连帽","goods_price":"999.99","goods_pic":"https://img.alicdn.com/imgextra/i2/676606897/O1CN0120os8G5TgI2MfPQ_!!676606897.jpg_430x430q90.jpg","goods_describe":"运动生活","goods_stock":"166","goods_owner":"徐易杰","updatetime":"2018-11-01 19:14:29","goods_kind":"衣服"},{"id":3,"goods_name":"【三只松鼠_碧根果210gx2】休闲零食坚果特产山核桃炒货长寿果","goods_location":"嘉兴","goods_tags":"icon_foods,炒货","goods_price":"15.00","goods_pic":"https://img.alicdn.com/imgextra/i2/880734502/TB2B6SzvRjTBKNjSZFwXXcG4XXa_!!880734502.jpg_430x430q90.jpg","goods_describe":"松鼠可劲造 10万爆款买1送1","goods_stock":"5442","goods_owner":"徐易杰","updatetime":"2018-11-01 19:14:29","goods_kind":"icon_foods"}]}
     */

    private boolean status;
    private int code;
    private String msg;
    private T data;
    private List<T> list;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "BaseGson{" +
                "status=" + status +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", list=" + list +
                '}';
    }
}
