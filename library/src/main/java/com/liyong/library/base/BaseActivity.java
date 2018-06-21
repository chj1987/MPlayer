package com.liyong.library.base;

import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.annotation.Nullable;

import com.liyong.library.mvp.BasePresenter;
import com.liyong.library.mvp.IBaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by ff on 2018/6/19.
 */

public abstract class BaseActivity<V extends IBaseView, P extends BasePresenter<V>> extends SupportActivity implements IBaseView {
    protected P mPresenter;
    private Unbinder mBind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mBind = ButterKnife.bind(this);

        init(savedInstanceState);
        mPresenter = getPresenter();

        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        mPresenter.attachView(getBaseView());

        mPresenter.onCreat();

        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            @Override
            public boolean queueIdle() {
                mPresenter.loadData();
                return false;
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        mPresenter.onSaveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        mPresenter.onStart();
        super.onStart();
    }

    @Override
    protected void onResume() {
        mPresenter.onResume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        mPresenter.onPause();
        super.onPause();
    }

    @Override
    protected void onStop() {
        mPresenter.onStop();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDestroy();
        mBind.unbind();
        super.onDestroy();
    }

    protected void init(Bundle savedInstanceState) {
    }

    private V getBaseView() {
        return (V) this;
    }

    protected abstract P createPresenter();

    private P getPresenter() {
        return mPresenter;
    }

    protected abstract int getLayoutId();
}
