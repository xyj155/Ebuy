package com.example.xuyijie.ebuyshop.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.gson.GoodGson;
import com.example.xuyijie.ebuyshop.view.activity.GoodDetailActivity;

import java.util.List;


public class GoodsAdapter extends BaseQuickAdapter<GoodGson.GoodsBean, BaseViewHolder> {

    private Context context;

    public GoodsAdapter(@Nullable List<GoodGson.GoodsBean> data, Context context) {
        super(R.layout.ry_goods_list_item, data);
        this.context = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, final GoodGson.GoodsBean item) {

        ImageView ivCover = helper.getView(R.id.iv_cover);
        Glide.with(context).asBitmap().load(item.getGoods_pic()).into(ivCover);//商品图片
        helper.setText(R.id.tv_name, item.getGoods_name())//商品名称
                .setText(R.id.tv_price, "￥ " + item.getGoods_price())
                .setText(R.id.ry_list, "标签：" + item.getGoods_tags())
        .setOnClickListener(R.id.ll_item, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GoodDetailActivity.class);
                intent.putExtra("id",String.valueOf(item.getId()));
                context.startActivity(intent);
            }
        });
    }




}
