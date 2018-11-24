package com.example.xuyijie.ebuyshop.api;


import com.example.xuyijie.ebuyshop.base.BaseGson;
import com.example.xuyijie.ebuyshop.base.EmptyGson;
import com.example.xuyijie.ebuyshop.gson.AdGson;
import com.example.xuyijie.ebuyshop.gson.AddressGson;
import com.example.xuyijie.ebuyshop.gson.BannerGson;
import com.example.xuyijie.ebuyshop.gson.BrandsClassifyGson;
import com.example.xuyijie.ebuyshop.gson.BrandsGson;
import com.example.xuyijie.ebuyshop.gson.CouponGson;
import com.example.xuyijie.ebuyshop.gson.ExpressGson;
import com.example.xuyijie.ebuyshop.gson.GoodGson;
import com.example.xuyijie.ebuyshop.gson.GoodsDetailGson;
import com.example.xuyijie.ebuyshop.gson.GoodsPrice;
import com.example.xuyijie.ebuyshop.gson.HomeCardGson;
import com.example.xuyijie.ebuyshop.gson.HotGoodsGson;
import com.example.xuyijie.ebuyshop.gson.LeanCloudGson;
import com.example.xuyijie.ebuyshop.gson.PostPackageGson;
import com.example.xuyijie.ebuyshop.gson.RunHelperGson;
import com.example.xuyijie.ebuyshop.gson.SecondHandGson;
import com.example.xuyijie.ebuyshop.gson.ShopGson;
import com.example.xuyijie.ebuyshop.gson.SubmitOrderGson;
import com.example.xuyijie.ebuyshop.gson.SubmitOrderListGson;
import com.example.xuyijie.ebuyshop.gson.UserGson;
import com.example.xuyijie.ebuyshop.gson.UserOrderFormAllListGson;
import com.example.xuyijie.ebuyshop.gson.UserOrderGson;
import com.example.xuyijie.ebuyshop.gson.UserShopCarGson;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by 徐易杰 on 2018/11/1.
 */

public interface Api {
    @GET("/SchoolShop/public/index.php/index/Goods/getGoodsListByLocation")
    Observable<BaseGson<GoodGson>> getGoodsListByLocation(@Query("location") String location, @Query("kind") String kind, @Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/Secondhand/getSecondHandsByLocation")
    Observable<BaseGson<SecondHandGson>> getSecondHandsByLocation(@Query("location") String id, @Query("kind") String kind);

    @GET("/SchoolShop/public/index.php/index/Home/getHomeCard")
    Observable<BaseGson<HomeCardGson>> getHomeCard(@Query("location") String location);

    @GET("/SchoolShop/public/index.php/index/Home/getBrands")
    Observable<BaseGson<BrandsClassifyGson>> getBrands();

    @GET("/SchoolShop/public/index.php/index/Home/getBrandsList")
    Observable<BaseGson<BrandsGson>> getBrandsList(@Query("location")String location);

    @FormUrlEncoded
    @POST("/SchoolShop/public/index.php/index/User/login")
    Observable<BaseGson<UserGson>> userLogin(@Field("username") String username, @Field("password") String password);

    @Headers({
            "X-LC-Id:fhk7oAJlYQnAXDhVENN9aBlL-gzGzoHsz",
            "X-LC-Key:qecrVBKPwUyz4TgSpcHnjURF",
            "Content-Type:application/json"
    })
    @POST("/1.1/requestSmsCode")
    Observable<LeanCloudGson> requestSms(@Body RequestBody params);

    @Headers({
            "X-LC-Id:fhk7oAJlYQnAXDhVENN9aBlL-gzGzoHsz",
            "X-LC-Key:qecrVBKPwUyz4TgSpcHnjURF",
            "Content-Type:application/json"
    })
    @POST("/1.1/verifySmsCode/{code}")
    Observable<LeanCloudGson> verifySmsCode(@Body RequestBody params, @Path("code") String code);

    @FormUrlEncoded
    @POST("/SchoolShop/public/index.php/index/User/register")
    Observable<BaseGson<UserGson>> userRegister(@Field("username") String username, @Field("password") String password, @Field("location") String location);


    @GET("/SchoolShop/public/index.php/index/Home/getBanner")
    Observable<BaseGson<BannerGson>> getBannerList(@Query("location") String location);

    @GET("/SchoolShop/public/index.php/index/Home/getActiveList")
    Observable<BaseGson<GoodGson.GoodsBean>> getActiveList(@Query("location") String location);

    @GET("/SchoolShop/public/index.php/index/Goods/getGoodsDetail")
    Observable<BaseGson<GoodsDetailGson>> getGoodsDetail(@Query("uid") String uid, @Query("good_id") String goodId, @Query("kind") String kind);

    @GET("/SchoolShop/public/index.php/index/Seller/getSellerList")
    Observable<BaseGson<ShopGson>> getSellerList(@Query("location") String location);

    @GET("/SchoolShop/public/index.php/index/Store/getSellerDetailById")
    Observable<BaseGson<ShopGson>> getSellerDetailById(@Query("uid") String uid, @Query("id") String id);

    @GET("/SchoolShop/public/index.php/index/Deliver/getUserPackageListById")
    Observable<BaseGson<PostPackageGson>> getUserPackageListById(@Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/User/getUserAddressList")
    Observable<BaseGson<AddressGson>> getUserAddressList(@Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/Goods/getShopCarGoodsList")
    Observable<BaseGson<GoodGson.GoodsBean>> getShopCarGoodsList(@Query("uid") String uid);

    @FormUrlEncoded
    @POST("/SchoolShop/public/index.php/index/User/addUserReceiveAddress")
    Observable<BaseGson<EmptyGson>> addUserReceiveAddress(
            @Field("username") String username,
            @Field("tel") String tel,
            @Field("address") String address,
            @Field("uid") String uid,
            @Field("location") String location,
            @Field("is_receive") String isReceive
    );

    @GET("/SchoolShop/public/index.php/index/Buyer/addGoodsCar")
    Observable<BaseGson<EmptyGson>> addGoodsCar(@Query("uid") String uid, @Query("gid") String gid, @Query("comment") String comment, @Query("isDelete") String isDelete);

    @GET("/SchoolShop/public/index.php/index/User/getUserOrdersList")
    Observable<BaseGson<UserOrderFormAllListGson>> getUserOrdersList(@Query("uid") String uid, @Query("status") String status);


    @GET("/SchoolShop/public/index.php/index/User/userBuyGoodsListByShopId")
    Observable<BaseGson<EmptyGson>> userBuyGoodsListByShopId(@Query("uid") String uid, @Query("sid") String sid, @Query("address") String address, @Query("tel") String tel, @Query("money") String money);


    @GET("/SchoolShop/public/index.php/index/User/getUserOrdersList")
    Observable<BaseGson<Integer>> getUserOrdersCount(@Query("uid") String uid, @Query("status") String status);

    @GET("/SchoolShop/public/index.php/index/User/getUserStoreCollection")
    Observable<BaseGson<ShopGson>> getUserStoreCollection(@Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/User/getUserGoodsCollection")
    Observable<BaseGson<GoodGson.GoodsBean>> getUserGoodsCollection(@Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/Deliver/getUserPackageById")
    Observable<BaseGson<ExpressGson>> getUserPackageById(@Query("id") String id);

    @GET("/SchoolShop/public/index.php/index/Order/getRunHelperByLocation")
    Observable<BaseGson<RunHelperGson>> getRunHelperByLocation(@Query("location") String location);

    @GET("/SchoolShop/public/index.php/index/Home/getADBanner")
    Observable<BaseGson<AdGson>> getADBanner(@Query("location") String location);

    @GET("/SchoolShop/public/index.php/index/Coupon/getCouponListByLocation")
    Observable<BaseGson<CouponGson>> getCouponListByLocation(@Query("uid") String uid, @Query("kind") String kind, @Query("location") String location);

    @GET("/SchoolShop/public/index.php/index/Goods/setUserOrder")
    Observable<BaseGson<EmptyGson>> setUserOrder(@Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/Order/submitRunHelperOrder")
    Observable<BaseGson<EmptyGson>> submitRunHelperOrder(@Query("uid") String uid, @Query("hid") String hid, @Query("request") String request);

    @GET("/SchoolShop/public/index.php/index/Goods/getGoodsPrice")
    Observable<BaseGson<GoodsPrice>> getGoodsPrice(@Query("gid") String gid, @Query("color") String color, @Query("model") String model, @Query("size") String size);

    @GET("/SchoolShop/public/index.php/index/Goods/submitUserShopCar")
    Observable<BaseGson<UserShopCarGson>> submitUserShopCar(@Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/Order/addShopCarGoodsNum")
    Observable<BaseGson<EmptyGson>> addShopCarGoodsNum(@Query("isdelete") String isdelete, @Query("uid") String uid, @Query("gid") String gid, @Query("comment") String comment, @Query("sid") String sid, @Query("isbuy") String isbuy, @Query("status") String status);

    @FormUrlEncoded
    @POST("/SchoolShop/public/index.php/index/Deliver/addUserSelfPackage")
    Observable<BaseGson<EmptyGson>> addUserSelfPackage(
            @Field("uid") String uid,
            @Field("num") String num,
            @Field("code") String code,
            @Field("name") String name,
            @Field("comment") String comment
    );

    @GET("/SchoolShop/public/index.php/index/Deliver/getUserAddedExpressList")
    Observable<BaseGson<PostPackageGson>> getUserAddedExpressList(@Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/Purse/getHotGoodsList")
    Observable<BaseGson<HotGoodsGson>> getHotGoodsList();

    @GET("/SchoolShop/public/index.php/index/Purse/getOrderInformation")
    Observable<BaseGson<SubmitOrderGson>> getOrderInformation(@Query("gid") String gid, @Query("uid") String uid);

    @GET("/SchoolShop/public/index.php/index/Goods/deleteUserShopCar")
    Observable<BaseGson<EmptyGson>> deleteUserShopCar(@Query("uid") String uid);


    @GET("/SchoolShop/public/index.php/index/User/UserAddCollection")
    Observable<BaseGson<EmptyGson>> UserAddCollection(@Query("uid") String uid, @Query("gid") String gid, @Query("isshop") String isshop, @Query("isdelete") String isdelete);

    @GET("/SchoolShop/public/index.php/index/Order/userPayGoodsOrder")
    Observable<BaseGson<EmptyGson>> userPayGoodsOrder(@Query("id") String id, @Query("address") String address, @Query("tel") String tel, @Query("count") String count, @Query("money") String money);

    @GET("/SchoolShop/public/index.php/index/Order/submitUserOrder")
    Observable<BaseGson<UserOrderGson>> submitUserOrder(@Query("uid") String uid, @Query("gid") String gid, @Query("in_id") String in_id, @Query("count") String count, @Query("money") String money, @Query("status") String status);

    @FormUrlEncoded
    @POST("/SchoolShop/public/index.php/index/User/Userfeedback")
    Observable<BaseGson<EmptyGson>> Userfeedback(@Field("uid") String uid, @Field("message") String message);


    @GET("/SchoolShop/public/index.php/index/User/getUserOrdersPayList")
    Observable<BaseGson<SubmitOrderListGson>> getUserOrdersPayList(@Query("uid") String uid, @Query("shopid") String shopid);
}
