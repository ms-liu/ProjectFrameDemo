package com.mmyz.mvp.improve.m;

import com.mmyz.mvp.improve.m.bean.ImproveInfoBean;

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

public class ImproveModelImpl implements IModel<ImproveInfoBean>{

    private ImproveInfoBean mModel;
    @Override
    public void setModel(ImproveInfoBean improveInfoBean) {
        this.mModel = improveInfoBean;
    }

    @Override
    public ImproveInfoBean getModel() {
        if (this.mModel == null){
            this.mModel = new ImproveInfoBean();
        }
        return mModel;
    }
}
