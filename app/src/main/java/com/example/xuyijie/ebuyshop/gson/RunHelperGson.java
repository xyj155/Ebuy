package com.example.xuyijie.ebuyshop.gson;

/**
 * Created by Administrator on 2018/11/11.
 */

public class RunHelperGson {

    /**
     * id : 1
     * u_id : 1
     * location : 嘉兴
     * is_verify : 1
     * tel : 17374131273
     * name : 徐易杰
     * address : 浙江省嘉兴市嘉兴学院梁林
     * avatar : https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3841743209,952064471&fm=27&gp=0.jpg
     */

    private int id;
    private int u_id;
    private String location;
    private String is_verify;
    private String tel;
    private String name;
    private String address;
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    private String avatar;
    private String key;
    private String username;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIs_verify() {
        return is_verify;
    }

    public void setIs_verify(String is_verify) {
        this.is_verify = is_verify;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
