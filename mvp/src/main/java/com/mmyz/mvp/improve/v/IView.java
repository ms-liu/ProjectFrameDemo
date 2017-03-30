package com.mmyz.mvp.improve.v;

import android.content.Context;

import com.mmyz.mvp.improve.listener.OnViewStateListener;

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

public interface IView {
    void bindListener(OnViewStateListener listener);

    Context getContext();

    void showToast(String message);

    void showLoadingDialog(String message);

    void hideLoadingDialog();

}
