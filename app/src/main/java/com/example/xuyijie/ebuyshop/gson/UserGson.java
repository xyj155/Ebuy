package com.example.xuyijie.ebuyshop.gson;

/**
 * Created by Administrator on 2018/11/2.
 */

public class UserGson {

    /**
     * id : 1
     * username : 123
     * password : 123
     * user_location : 嘉兴
     * user_score : 50
     * vip_rank : 1
     * balance : 50.00
     */

    private int id;
    private String username;
    private String password;
    private String user_location;
    private String user_score;
    private String vip_rank;
    private String balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_location() {
        return user_location;
    }

    public void setUser_location(String user_location) {
        this.user_location = user_location;
    }

    public String getUser_score() {
        return user_score;
    }

    public void setUser_score(String user_score) {
        this.user_score = user_score;
    }

    public String getVip_rank() {
        return vip_rank;
    }

    public void setVip_rank(String vip_rank) {
        this.vip_rank = vip_rank;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
