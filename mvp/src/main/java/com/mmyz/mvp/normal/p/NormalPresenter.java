package com.mmyz.mvp.normal.p;

import com.mmyz.mvp.normal.m.NormalModelImpl;
import com.mmyz.mvp.normal.m.bean.NormalInfoBean;
import com.mmyz.mvp.normal.v.IView;
import com.mmyz.mvp.normal.v.NormalActivity;

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

public class NormalPresenter extends BasePresenter<NormalModelImpl,NormalActivity> {


    private final NormalModelImpl mDao;

    public NormalPresenter(NormalActivity normalActivity) {
        super(normalActivity);
        mDao = createModelDao();
        getExplain();
    }

    @Override
    public NormalModelImpl createModelDao() {
        return new NormalModelImpl();
    }

    @Override
    public boolean checkView(NormalActivity normalActivity) {
        return normalActivity != null;
    }

    public void setUserName(String userName){
        mDao.setUserName(userName);
    }

    public void setPassword(String password){
        mDao.setPassword(password);
    }

    public void getExplain(){
        getView().showExplain(mDao.getModel().explain);
    }

    public void getInfoBean(){
        NormalInfoBean model = mDao.getModel();
        getView().showInfo("用户名："+model.getName()+"\r\n密码："+model.getPassword());
    }

    public void setInfo(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }
}
