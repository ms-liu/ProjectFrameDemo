package com.mmyz.mvp.normal.p;

import com.mmyz.mvp.normal.m.INormalModel;
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

public interface IPresenter<M,V extends IView> {
    V getView();

    M createModelDao();

    boolean checkView(V v);
}
