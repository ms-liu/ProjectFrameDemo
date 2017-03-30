package com.mmyz.projectframe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mmyz.mvc.vc.MvcActivity;
import com.mmyz.mvp.MvpActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_mvc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForClass(MvcActivity.class);
            }
        });
        findViewById(R.id.btn_mvp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForClass(MvpActivity.class);
            }
        });
    }

    private void startActivityForClass(Class clazz){
        startActivity(new Intent(MainActivity.this,clazz));
    }
}
