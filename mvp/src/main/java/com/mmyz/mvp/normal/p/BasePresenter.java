package com.mmyz.mvp.normal.p;

import com.mmyz.mvp.exception.NotBindViewException;
import com.mmyz.mvp.normal.v.IView;

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

public abstract class BasePresenter<M,V extends IView> implements IPresenter<M,V> {

    private V mV;

    public BasePresenter(V v){
        if (checkView(v)){
            this.mV = v;
        }else {
            throw new NotBindViewException();
        }
    }

    @Override
    public V getView() {
        return mV;
    }


    @Override
    public boolean checkView(V v) {
        return v != null;
    }
}
