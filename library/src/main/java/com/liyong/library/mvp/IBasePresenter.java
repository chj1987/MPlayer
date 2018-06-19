package com.liyong.library.mvp;

/**
 * Created by ff on 2018/6/19.
 */

public interface IBasePresenter<V extends IBaseView> {
    void attachView(V view);

    void detachView();
}
