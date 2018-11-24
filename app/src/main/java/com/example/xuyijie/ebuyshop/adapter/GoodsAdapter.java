package com.example.xuyijie.ebuyshop.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.gson.GoodGson;

import java.util.List;


public class GoodsAdapter extends BaseQuickAdapter<GoodGson.GoodsBean, BaseViewHolder> {

    private Context context;

    public GoodsAdapter(@Nullable List<GoodGson.GoodsBean> data, Context context) {
        super(R.layout.ry_goods_list_item, data);
        this.context = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, GoodGson.GoodsBean item) {

        ImageView ivCover = helper.getView(R.id.iv_cover);
        Glide.with(context).asBitmap().load(item.getGoods_pic()).into(ivCover);//商品图片
        helper.setText(R.id.tv_name, item.getGoods_name())//商品名称
                .setText(R.id.tv_price, "￥ " + item.getGoods_price())
                .setText(R.id.ry_list, "标签：" + item.getGoods_tags());
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


}
