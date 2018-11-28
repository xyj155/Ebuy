package com.example.xuyijie.ebuyshop.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Administrator on 2018/11/23.
 */

public class ShopCarFragment extends BaseFragment {
    @InjectView(R.id.tv_title)
    TextView tvTitle;
    @InjectView(R.id.ry_shopcar)
    RecyclerView ryShopcar;

    @Override
    protected int setView() {
        return R.layout.fragment_shop_car;
    }

    @Override
    protected void init(View view) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            strings.add("测试" + i);
        }
        ryShopcar.setLayoutManager(new LinearLayoutManager(getContext()));
//
        TestAdapter testAdapter = new TestAdapter(strings);
        ryShopcar.setAdapter(testAdapter);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.inject(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    private class TestAdapter extends BaseQuickAdapter<String, BaseViewHolder> {


        public TestAdapter(@Nullable List<String> data) {
            super(R.layout.ry_shop_car_item, data);

        }

        @Override
        protected void convert(BaseViewHolder helper, String item) {
            helper.setText(R.id.tv_goods_name, item);
        }

    }
}
