package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class BrandsList {

    /**
     * key : H
     * list : [{"name":"海澜之家","initials":"H"},{"name":"花花公子","initials":"H"},{"name":"花姐","initials":"H"}]
     */

    private String key;
    private List<ListBean> list;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * name : 海澜之家
         * initials : H
         */

        private String name;
        private String initials;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInitials() {
            return initials;
        }

        public void setInitials(String initials) {
            this.initials = initials;
        }

    }
}
