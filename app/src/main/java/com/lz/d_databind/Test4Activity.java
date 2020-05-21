package com.lz.d_databind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.lz.d_databind.databinding.ActivityTest4Binding;
import com.lz.d_databind.model.ObservableUser;

public class Test4Activity extends AppCompatActivity {


    ObservableUser observableUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bind();
    }

    private void bind() {
        ActivityTest4Binding bind = DataBindingUtil.setContentView(this, R.layout.activity_test4);

        observableUser = new ObservableUser();
        observableUser.setAge(18);
        observableUser.setName("周星星");

        bind.setUser(observableUser);

        bind.tvAdd.setText("修改年龄");
        bind.tvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                observableUser.setAge(28);
            }
        });
    }
}
