package com.example.xuyijie.ebuyshop.gson;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class HomeCardGson {

    /**
     * id : 1
     * name : 节日优选
     * pic : https://img10.static.yhbimg.com/goodsimg/2018/11/07/09/014cee0c6da5d72722a222143dc4a6264f.jpg?imageMogr2/thumbnail/280x382/background/d2hpdGU=/position/center/quality/80
     * kind : null
     * location : 嘉兴
     */

    private int id;
    private String name;
    private String pic;
    private Object kind;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Object getKind() {
        return kind;
    }

    public void setKind(Object kind) {
        this.kind = kind;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
