package com.mmyz.mvp.improve.v;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

import com.mmyz.mvp.improve.listener.OnViewStateListener;

import java.util.ArrayList;
import java.util.List;

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

public class ViewDelegate implements IView,OnViewStateListener {

    private Context mCtx;
    private ProgressDialog mProgressDialog;

    public ViewDelegate(Context context){
        this.mCtx = context;
    }


    private List<OnViewStateListener> mOnViewStateListeners ;

    @Override
    public void bindListener(OnViewStateListener listener) {
        if (mOnViewStateListeners == null){
            mOnViewStateListeners = new ArrayList<>();
            mOnViewStateListeners.add(listener);
        }else {
            if (!mOnViewStateListeners.contains(listener)){
                mOnViewStateListeners.add(listener);
            }
        }
    }

    @Override
    public Context getContext() {
        return mCtx;
    }

    @Override
    public void showToast(String message) {
        if (mCtx != null) {
            Toast.makeText(mCtx, message, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showLoadingDialog(String message) {
        if (mCtx != null){
            mProgressDialog = new ProgressDialog(mCtx);
        }
    }

    @Override
    public void hideLoadingDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()){
            mProgressDialog.hide();
        }
    }

    //------------------Life Manager--------------------------------------------------------

    @Override
    public void onCreate() {
        if (checkListener()){
            for (OnViewStateListener listener:
                 mOnViewStateListeners) {
                listener.onCreate();
            }
        }
    }

    @Override
    public void onPause() {
        if (checkListener()){
            for (OnViewStateListener listener:
                    mOnViewStateListeners) {
                listener.onPause();
            }
        }
    }

    @Override
    public void onResume() {
        if (checkListener()){
            for (OnViewStateListener listener:
                    mOnViewStateListeners) {
                listener.onResume();
            }
        }
    }

    @Override
    public void onStop() {
        if (checkListener()){
            for (OnViewStateListener listener:
                    mOnViewStateListeners) {
                listener.onStop();
            }
        }
    }

    @Override
    public void onDestroy() {
        if (checkListener()){
            for (OnViewStateListener listener:
                    mOnViewStateListeners) {
                listener.onDestroy();
            }
        }
    }

    private boolean checkListener(){
        return mOnViewStateListeners != null && !mOnViewStateListeners.isEmpty();
    }
}
