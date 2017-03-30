package com.mmyz.mvp.improve.p;

import com.mmyz.mvp.improve.listener.OnViewStateListener;
import com.mmyz.mvp.improve.v.IView;


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

public interface IImprovePresenter<M,V extends IView> extends OnViewStateListener {

    void bindView(V v);

    M loadModel();

    void detachView();

}
