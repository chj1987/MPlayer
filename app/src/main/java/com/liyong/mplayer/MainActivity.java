package com.liyong.mplayer;

import android.content.Context;

import com.liyong.library.base.BaseActivity;

public class MainActivity extends BaseActivity<MainActivity, MainPresenter> implements MainActivityContract.Presenter {


    @Override
    public Context getContext() {
        return (Context) this;
    }


    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
