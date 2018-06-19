package com.liyong.library.mvp;

import android.os.Bundle;

import java.lang.ref.WeakReference;

/**
 * Created by ff on 2018/6/19.
 */

public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {
    protected WeakReference<V> mViewRef;

    @Override
    public void attachView(V view) {
        mViewRef = new WeakReference<V>(view);
    }

    public V getView() {
        return mViewRef == null ? null : mViewRef.get();
    }

    @Override
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public abstract void onCreat();

    public abstract void loadData();

    public void onStart() {

    }

    public void onResume() {
    }

    public void onPause() {
    }

    public void onStop() {
    }

    public void onDestroy() {
    }

    public void onSaveInstanceState(Bundle outState) {

    }
}
