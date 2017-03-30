package com.mmyz.mvp.normal.v;

import android.content.Context;

/**
 * ==============================================
 * <p>
 * 类名：IView
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/3/30
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public interface IView {
    void showLoading();
    void hideLoading();
    Context getContext();
}
