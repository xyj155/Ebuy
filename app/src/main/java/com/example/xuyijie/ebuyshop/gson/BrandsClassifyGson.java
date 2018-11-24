package com.example.xuyijie.ebuyshop.gson;

import java.util.List;

/**
 * Created by 徐易杰 on 2018/11/24.
 */

public class BrandsClassifyGson<T> {


    /**
     * key : H
     * value : [{"name":"海澜之家","initials":"H"},{"name":"花花公子","initials":"H"},{"name":"花姐","initials":"H"}]
     */

    private String key;
    private List<ValueBean> value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<ValueBean> getValue() {
        return value;
    }

    public void setValue(List<ValueBean> value) {
        this.value = value;
    }

    public static class ValueBean {
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
