package com.mmyz.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.mmyz.mvp.improve.v.ImproveActivity;
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

public class MvpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        TextView tvExplain = (TextView) findViewById(R.id.tv_explain);
        tvExplain.setText("在Mvp框架中，View层与Model层之间多了，一个Presenter作为媒介，View层不再与Model层交互" +
                "Presenter通过定义在View接口中的方法实现交互，符合面向接口编程的思想，实现了解耦，通常一个View对应一个Presenter，但有些相对" +
                "复杂的页面也可以绑定多个Presenter，将页面进行细化成多个组件，对每个组件绑定Presenter，符合组件化开发的思想");
        findViewById(R.id.btn_mvp_normal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForClass(NormalActivity.class);
            }
        });

        findViewById(R.id.btn_mvp_improve).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForClass(ImproveActivity.class);
            }
        });
    }


    private void startActivityForClass(Class clazz){
        startActivity(new Intent(MvpActivity.this,clazz));
    }
}
