package com.liyong.library.utils;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Created by ff on 2018/6/9.
 */

public class LogUtil {

    public static void init(boolean isLogEnable) {
        Logger.init("com.liyong.mplayer")
                .hideThreadInfo()
                .logLevel(isLogEnable ? LogLevel.FULL : LogLevel.NONE)
                .methodOffset(2);
    }

    public static void v(String tag, String msg) {
        Logger.t(tag).v(msg);

    }

    public static void v(String tag, String msg, Throwable throwable) {

        Logger.t(tag).v(msg, throwable);

    }

    public static void d(String tag, String msg) {

        Logger.t(tag).d(msg);

    }

    public static void d(String tag, String msg, Throwable throwable) {


        Logger.t(tag).d(msg, throwable);


    }

    public static void i(String tag, String msg) {

        Logger.t(tag).i(msg);

    }

    public static void i(String tag, String msg, Throwable throwable) {

        Logger.t(tag).i(msg, throwable);

    }

    public static void w(String tag, String msg) {

        Logger.t(tag).w(msg);

    }

    public static void w(String tag, String msg, Throwable throwable) {

        Logger.t(tag).w(msg, throwable);

    }

    public static void e(String tag, String msg) {

        Logger.t(tag).e(msg);

    }

    public static void e(String tag, String msg, Throwable throwable) {

        Logger.t(tag).e(msg, throwable);

    }

    public static void json(String tag, String json) {
        Logger.t(tag).json(json);
    }
}
