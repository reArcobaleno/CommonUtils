package com.android.sugar.commonutils;

import android.util.Log;

/**
 * @ClassName: L
 * @Description: Log统一管理类
 * @author: SugarT
 * @date: 16/7/19 下午1:59
 */
public class L {

    private L() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 是否需要打印bug，可以在application的onCreate函数里面初始化
     */
    public static boolean isDebug = true;
    
    private static final String TAG = "sugar";

    /**
     * 下面四个是默认tag的函数
     *
     * @param msg
     */
    public static void i(String msg) {
        if (isDebug)
            Log.i(TAG, msg);
    }

    public static void d(String msg) {
        if (isDebug)
            Log.d(TAG, msg);
    }

    public static void e(String msg) {
        if (isDebug)
            Log.e(TAG, msg);
    }

    public static void v(String msg) {
        if (isDebug)
            Log.v(TAG, msg);
    }

    /**
     * 下面是传入自定义tag的函数
     *
     * @param tag
     * @param msg
     */
    public static void i(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }
}
