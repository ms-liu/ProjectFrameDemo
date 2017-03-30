package com.mmyz.mvc.vc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mmyz.mvc.R;
import com.mmyz.mvc.m.MvcModel;

import java.util.ArrayList;
import java.util.List;


/**
 * ==============================================
 * <p>
 * 类名：MvcActivity
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/3/30
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public class MvcActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvShowInfo;
    private TextView tvExplain;
    private EditText etUsername;
    private EditText etPassword;
    private Button btnSave;
    private Button btnGet;

    private MvcModel mData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        tvExplain = (TextView) findViewById(R.id.tv_explain);
        tvShowInfo = (TextView) findViewById(R.id.tv_show_info);
        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);

        btnSave = (Button) findViewById(R.id.btn_save);
        btnGet = (Button) findViewById(R.id.btn_get);

        btnSave.setOnClickListener(this);
        btnGet.setOnClickListener(this);
        mData = getData();
        tvExplain.setText(mData.explain);

    }


    //获取数据
    private MvcModel getData() {
        return  new MvcModel();
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.btn_save) {
            if (mData != null){
                Toast.makeText(MvcActivity.this,"保存成功",Toast.LENGTH_SHORT).show();
                mData.setName(etUsername.getText().toString());
                mData.setPassword(etPassword.getText().toString());
            }
        } else if (i == R.id.btn_get) {
            if (mData != null){
                tvShowInfo.setText("用户名："+mData.name+"\r\n密码："+mData.password);
            }
        } else {

        }
    }
}
