package com.liyong.mplayer;

import com.liyong.library.mvp.IBaseView;

/**
 * Created by ff on 2018/6/19.
 */

public interface MainActivityContract {
    interface View extends IBaseView {
    }

    interface Presenter {
        void showLoading();

        void hideLoading();
    }
}
