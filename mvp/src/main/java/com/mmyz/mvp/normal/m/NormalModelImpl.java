package com.mmyz.mvp.normal.m;

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

public class NormalModelImpl implements INormalModel<NormalInfoBean> {
    private NormalInfoBean bean;

    public NormalModelImpl(){
        bean = new NormalInfoBean();
    }

    @Override
    public void setModel(NormalInfoBean bean) {
        this.bean = bean;
    }


    @Override
    public NormalInfoBean getModel() {
        return bean;
    }

    public void setUserName(String userName){
        if (bean != null){
            bean.setName(userName);
        }
    }

    public void setPassword(String password){
        if (bean != null){
            bean.setPassword(password);
        }
    }

}
