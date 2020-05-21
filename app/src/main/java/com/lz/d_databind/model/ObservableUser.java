package com.lz.d_databind.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.lz.d_databind.BR;

public class ObservableUser extends BaseObservable {

    private String name;
    private int age;

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }


    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);

    }
}
