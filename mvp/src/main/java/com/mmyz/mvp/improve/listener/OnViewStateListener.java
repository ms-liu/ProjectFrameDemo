package com.mmyz.mvp.improve.listener;

/**
 * ==============================================
 * <p>
 * 类名：
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/3/30
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public interface OnViewStateListener {

    void onCreate();

    void onPause();

    void onResume();

    void onStop();

    void onDestroy();
}
