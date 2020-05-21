package com.lz.d_databind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.lz.d_databind.databinding.ActivityTest3Binding;
import com.lz.d_databind.model.ObservablePropertyUser;

public class Test3Activity extends AppCompatActivity {

    private ObservablePropertyUser opUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bind();
    }

    private void bind() {

        ActivityTest3Binding bind = DataBindingUtil.setContentView(this, R.layout.activity_test3);

        opUser = new ObservablePropertyUser();
        opUser.name.set("张三丰");
        opUser.age.set(18);
        bind.setUser(opUser);


        bind.tvAdd.setText("修改年龄");
        bind.tvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opUser.age.set(20);
            }
        });
    }
}
