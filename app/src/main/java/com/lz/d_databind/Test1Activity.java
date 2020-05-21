package com.lz.d_databind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lz.d_databind.databinding.ActivityTest1Binding;
import com.lz.d_databind.model.User;


/**
 * 简单 数据绑定
 */
public class Test1Activity extends AppCompatActivity {


    ActivityTest1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test1);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_test1);
        User user1 = new User("Test1", "User1");
        binding.setUser(user1);

        binding.tvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Test1Activity.this, Test2Activity.class));
            }
        });
    }



}
