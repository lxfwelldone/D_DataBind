package com.lz.d_databind;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.lz.d_databind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bind();
    }

    private void bind() {

        ActivityMainBinding bind = DataBindingUtil.setContentView(this, R.layout.activity_main);

        bind.tvSimple.setText("简单单个数据绑定");
        bind.tvSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Test1Activity.class));
            }
        });

        bind.tvList.setText("简单 recyclerView 数据绑定");
        bind.tvList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Test2Activity.class));
            }
        });


        bind.tvDemo3.setText("可观察属性");
        bind.tvDemo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Test3Activity.class));
            }
        });

        bind.tvDemo4.setText("可观察类");
        bind.tvDemo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Test4Activity.class));

            }
        });
    }
}
