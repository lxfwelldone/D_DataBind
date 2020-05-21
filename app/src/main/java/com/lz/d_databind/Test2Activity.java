package com.lz.d_databind;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lz.d_databind.adapter.UserListAdapter;
import com.lz.d_databind.databinding.ActivityTest2Binding;
import com.lz.d_databind.listener.OnClickUserListener;
import com.lz.d_databind.model.User;

import java.util.ArrayList;
import java.util.List;


/**
 * recyclerview 数据绑定
 */
public class Test2Activity extends AppCompatActivity {


    ActivityTest2Binding binding;
    UserListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myInit();
    }

    private void myInit() {

        List<User> list = new ArrayList<>();
        list.add(new User("张", "三丰"));
        list.add(new User("赵", "敏"));
        list.add(new User("谢", "逊"));
        list.add(new User("德玛", "西亚"));
        list.add(new User("德玛", "皇子"));
        list.add(new User("王", "二"));
        list.add(new User("李", "四"));
        list.add(new User("金", "科斯"));
        list.add(new User("拉", "科斯"));
        list.add(new User("拉", "科斯"));
        list.add(new User(null, "科斯"));
        list.add(new User(null, "科斯"));

        binding = DataBindingUtil.setContentView(this, R.layout.activity_test2);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        listAdapter = new  UserListAdapter(list, this, new OnClickUserListener() {
            @Override
            public void clickAt(User user) {
                Toast.makeText(Test2Activity.this, user.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        binding.recycler.setAdapter(listAdapter);
        binding.recycler.setLayoutManager(linearLayoutManager);
    }
}
