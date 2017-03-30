package com.mmyz.mvp.improve.v;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

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

public class BaseActivity extends AppCompatActivity implements IView{

    private ViewDelegate mDelegate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDelegate = new ViewDelegate(this);

    }


    @Override
    public void bindListener(OnViewStateListener listener) {
        mDelegate.bindListener(listener);
    }

    @Override
    public Context getContext() {
        return BaseActivity.this;
    }

    @Override
    public void showToast(String message) {
        mDelegate.showToast(message);
    }

    @Override
    public void showLoadingDialog(String message) {
        mDelegate.showLoadingDialog(message);
    }

    @Override
    public void hideLoadingDialog() {
        mDelegate.hideLoadingDialog();
    }
}
