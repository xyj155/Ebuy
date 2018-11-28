package com.example.xuyijie.ebuyshop.view.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xuyijie.ebuyshop.R;
import com.example.xuyijie.ebuyshop.base.BaseActivity;
import com.example.xuyijie.ebuyshop.contract.GoodDetailContract;
import com.example.xuyijie.ebuyshop.gson.GoodsDetailGson;
import com.example.xuyijie.ebuyshop.presenter.GoodDetailPresenter;
import com.flipboard.bottomsheet.BottomSheetLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class GoodDetailActivity extends BaseActivity implements GoodDetailContract.View {
    @InjectView(R.id.iv_back)
    ImageView ivBack;
    @InjectView(R.id.tv_menu)
    TextView tvMenu;
    @InjectView(R.id.tv_title)
    TextView tvTitle;
    @InjectView(R.id.iv_shopcar)
    ImageView ivShopcar;
    @InjectView(R.id.tv_shopcar_count)
    TextView tvShopcarCount;
    @InjectView(R.id.tv_count)
    RelativeLayout tvCount;
    @InjectView(R.id.bottomSheetLayout)
    BottomSheetLayout bottomSheetLayout;
    @InjectView(R.id.fl_goods)
    FrameLayout flGoods;
    @InjectView(R.id.goods_drawer)
    DrawerLayout goodsDrawer;


    @InjectView(R.id.tv_name)
    TextView tvName;
    @InjectView(R.id.tv_price)
    TextView tvPrice;
    @InjectView(R.id.fb_add)
    FloatingActionButton fbAdd;
    @InjectView(R.id.fb_buy)
    FloatingActionButton fbBuy;
    private GoodDetailPresenter goodDetailPresenter = new GoodDetailPresenter(this);


    @Override
    public int intiLayout() {
        return R.layout.activity_good_detail;
    }

    @Override
    public void initView() {
        ButterKnife.inject(this);
        initToolBar().setToolbarBackIco().setToolBarMenu("评价").setToolbarMenuEvent(new OnClickListener() {
            @Override
            public void onClickListener() {
                goodsDrawer.openDrawer(Gravity.RIGHT);
            }
        });

    }



    @Override
    public void initData() {
        goodDetailPresenter.getGoodsDetail("1", getIntent().getStringExtra("id"));
    }

    @Override
    protected int setStatusBarColor() {
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void loadFailed(String msg) {

    }

    @Override
    public void setGoodDetail(GoodsDetailGson commentGson) {
        tvPrice.setText("￥" + commentGson.getGoods().getGoods_price());
        tvName.setText(commentGson.getGoods().getGoods_name());
        List<String> data = new ArrayList<>();
        for (int i = 0; i < commentGson.getGoods().getPicture().size(); i++) {
            data.add(commentGson.getGoods().getPicture().get(i));
        }

    }

    @OnClick({R.id.iv_shopcar, R.id.fb_add, R.id.fb_buy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_shopcar:
                break;
            case R.id.fb_add:
                ScaleAnimation scaleAnimation = (ScaleAnimation) AnimationUtils.loadAnimation(GoodDetailActivity.this, R.anim.scale_floatingbutton_zoom_to);
                fbAdd.startAnimation(scaleAnimation);
                break;
            case R.id.fb_buy:
                ScaleAnimation scaleAnimationOut = (ScaleAnimation) AnimationUtils.loadAnimation(GoodDetailActivity.this, R.anim.scale_floatingbutton_zoom_out);
                fbAdd.startAnimation(scaleAnimationOut);
                break;
        }
    }
}
