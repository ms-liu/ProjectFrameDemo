package com.mmyz.mvp.improve.p;

import com.mmyz.mvp.improve.m.ImproveModelImpl;
import com.mmyz.mvp.improve.v.IImproveView;
import com.mmyz.mvp.normal.m.bean.NormalInfoBean;

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

public class ImprovePresenter extends BaseImprovePresenter<ImproveModelImpl,IImproveView> {

    private IImproveView mView;
    private ImproveModelImpl mModel;

    @Override
    public void bindView(IImproveView iImproveView) {
        this.mView = iImproveView;
        mModel = loadModel();
        mView.showExplain(mModel.getModel().explain);

    }

    @Override
    public ImproveModelImpl loadModel() {
        addHandleMethod("异步请求数据方法");
        return new ImproveModelImpl();
    }

    @Override
    public void detachView() {
        clearMethod();
    }

    public void setInfo(String username, String password) {
        if (mModel != null){
            mModel.getModel().setName(username);
            mModel.getModel().setPassword(password);
        }
    }

    public void getInfoBean(){
        mView.showInfo("用户名："+mModel.getModel().getName()+"\r\n密码："+mModel.getModel().getPassword());
    }

}
