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

        binding = DataBindingUtil.setContentView(this, R.layout.activity_test1);
        User user1 = new User("Test1", "User1");
        binding.setUser(user1);

    }



}
