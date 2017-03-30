package com.mmyz.mvp.improve.p;

import com.mmyz.mvp.improve.m.IModel;
import com.mmyz.mvp.improve.m.ImproveModelImpl;
import com.mmyz.mvp.improve.v.IImproveView;
import com.mmyz.mvp.improve.v.IView;

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

public abstract class BaseImprovePresenter<M extends IModel,V extends IView> implements IImprovePresenter<M,V> {

    private List<String> mMethods;

    public BaseImprovePresenter(){
        this.mMethods = new ArrayList<>();
    }


    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    //---------------------模拟需要在生命周期中处理的逻辑--------------------------------------

    public void addHandleMethod(String methodName){
        if (mMethods != null){
            mMethods.add(methodName);
        }
    }

    public void clearMethod(){
        if (mMethods != null && !mMethods.isEmpty()){
            mMethods.clear();
        }
    }
}
