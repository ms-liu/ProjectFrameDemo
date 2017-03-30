package com.mmyz.mvp.improve.p;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mmyz.mvp.R;
import com.mmyz.mvp.exception.NotBindPresenterException;
import com.mmyz.mvp.exception.NotBindViewException;
import com.mmyz.mvp.improve.m.ImproveModelImpl;
import com.mmyz.mvp.improve.v.IImproveView;

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

public class ImprovePresenterProxy implements IImprovePresenter<ImproveModelImpl,IImproveView>, View.OnClickListener {


    private ImprovePresenter mPresenter;
    private EditText etUserName;
    private EditText etPassword;
    private TextView componentShowInfo;
    private TextView componentExplain;
    private IImproveView mView;

    public ImprovePresenterProxy(ImprovePresenter improvePresenter){

        //判空
        checkPresenter(improvePresenter);
        //可以考虑依赖注入 方式
        this.mPresenter = improvePresenter;
        loadModel();
    }

    private void checkPresenter(ImprovePresenter improvePresenter) {
        if (improvePresenter == null){
            throw new NotBindPresenterException();
        }
    }


    @Override
    public ImproveModelImpl loadModel() {
        return mPresenter.loadModel();
    }

    @Override
    public void bindView(IImproveView iImproveView) {
        checkView(iImproveView);
        this.mView = iImproveView;
        mPresenter.bindView(iImproveView);
    }

    private void checkView(IImproveView iImproveView) {
        if (iImproveView == null){
            throw new NotBindViewException();
        }
    }

    @Override
    public void detachView() {
        mPresenter.detachView();
    }

    @Override
    public void onCreate() {
        //to do something
    }

    @Override
    public void onPause() {
        //to do something
    }

    @Override
    public void onResume() {
        //to do something
    }

    @Override
    public void onStop() {
        //to do something
    }

    @Override
    public void onDestroy() {
        detachView();
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.btn_save) {
            if (etUserName != null && etPassword != null){
                mView.showToast("保存成功");
                mPresenter.setInfo(etUserName.getText().toString(),etPassword.getText().toString());
            }
        } else if (i == R.id.btn_get) {
            mPresenter.getInfoBean();
        } else {

        }
    }

    public void setComponentName(EditText etUsername) {
        this.etUserName = etUsername;
    }

    public void setComponentPassword(EditText etPassword) {
        this.etPassword = etPassword;
    }


    public void setComponentShowInfo(TextView componentShowInfo) {
        this.componentShowInfo = componentShowInfo;
    }

    public void setComponentExplain(TextView componentExplain) {
        this.componentExplain = componentExplain;
    }
}
