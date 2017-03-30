package com.mmyz.mvp.normal.v;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mmyz.mvp.R;
import com.mmyz.mvp.normal.p.NormalPresenter;

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

public class NormalActivity extends AppCompatActivity implements INormalView, View.OnClickListener {

    private TextView tvTitle;
    private TextView tvExplain;
    private TextView tvShowInfo;
    private EditText etUsername;
    private EditText etPassword;
    private NormalPresenter mPresenter;

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

        btnSave.setOnClickListener(this);
        btnGet.setOnClickListener(this);

        mPresenter = new NormalPresenter(this);

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public Context getContext() {
        return NormalActivity.this;
    }

    @Override
    public void showInfo(String info) {
        tvShowInfo.setText(info);
    }

    @Override
    public void showExplain(String explain) {
        tvExplain.setText(explain);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.btn_save) {
            mPresenter.setInfo(etUsername.getText().toString(),etPassword.getText().toString());
        } else if (i == R.id.btn_get) {
            mPresenter.getInfoBean();
        } else {

        }
    }
}
