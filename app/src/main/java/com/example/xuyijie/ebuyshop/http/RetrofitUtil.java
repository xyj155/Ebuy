package com.example.xuyijie.ebuyshop.http;


import com.example.xuyijie.ebuyshop.api.Api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/6/25.
 */

public class RetrofitUtil {
    private static final String BASE_URL = "http://120.79.5.238/";
    private static final String LEAN_CLOUD_SEND = "https://leancloud.cn/";

    private Retrofit retrofit;
    private static RetrofitUtil sLeanCloudInstance;
    private static RetrofitUtil sInstance;


    public RetrofitUtil(String url) {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
    public static RetrofitUtil getLeanCloudInstance() {
        synchronized (RetrofitUtil.class) {
            if (sLeanCloudInstance == null) {
                sLeanCloudInstance = new RetrofitUtil(LEAN_CLOUD_SEND);
            }
        }
        return sLeanCloudInstance;
    }
    public static RetrofitUtil getInstance() {
        synchronized (RetrofitUtil.class) {
            if (sInstance == null) {
                sInstance = new RetrofitUtil(BASE_URL);
            }
        }
        return sInstance;
    }

    public Api getServerices() {
        return retrofit.create(Api.class);
    }
}