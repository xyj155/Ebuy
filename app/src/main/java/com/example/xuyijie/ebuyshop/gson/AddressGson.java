package com.example.xuyijie.ebuyshop.gson;

/**
 * Created by 徐易杰 on 2018/11/7.
 */

public class AddressGson {
    @Override
    public String toString() {
        return "AddressGson{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", address='" + address + '\'' +
                ", updatetime=" + updatetime +
                ", tel='" + tel + '\'' +
                ", username='" + username + '\'' +
                ", is_receive='" + is_receive + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    /**
     * id : 1
     * user_id : 1
     * address : 智汇家园
     * updatetime : null
     * tel : 17374131273
     * username : 徐易杰
     * is_receive : 1
     */

    private int id;
    private int user_id;
    private String address;
    private Object updatetime;
    private String tel;
    private String username;
    private String is_receive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Object updatetime) {
        this.updatetime = updatetime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIs_receive() {
        return is_receive;
    }

    public void setIs_receive(String is_receive) {
        this.is_receive = is_receive;
    }
}

