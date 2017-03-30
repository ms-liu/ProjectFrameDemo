package com.mmyz.mvp.improve.v;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mmyz.mvp.R;
import com.mmyz.mvp.improve.p.ImprovePresenter;
import com.mmyz.mvp.improve.p.ImprovePresenterProxy;

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

public class ImproveActivity extends BaseActivity implements IImproveView {


    private TextView tvTitle;
    private TextView tvExplain;
    private TextView tvShowInfo;
    private EditText etUsername;
    private EditText etPassword;
    private ViewDelegate mDelegate;
    private ImprovePresenterProxy mPresenterProxy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvExplain = (TextView) findViewById(R.id.tv_explain);
        tvShowInfo = (TextView) findViewById(R.id.tv_show_info);

        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);

        Button btnSave =  (Button) findViewById(R.id.btn_save);
        Button btnGet =  (Button) findViewById(R.id.btn_get);

        //可以考虑依赖注入 方式
        mPresenterProxy = new ImprovePresenterProxy(new ImprovePresenter());
        mPresenterProxy.bindView(this);
        mPresenterProxy.setComponentName(etUsername);
        mPresenterProxy.setComponentPassword(etPassword);
        mPresenterProxy.setComponentExplain(tvShowInfo);
        mPresenterProxy.setComponentShowInfo(tvExplain);

        btnSave.setOnClickListener(mPresenterProxy);
        btnGet.setOnClickListener(mPresenterProxy);

    }

    @Override
    public void showInfo(String info) {
        tvShowInfo.setText(info);
    }

    @Override
    public void showExplain(String explain) {
        tvExplain.setText(explain);
    }


}
