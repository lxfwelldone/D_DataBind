package com.lz.d_databind.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.lz.d_databind.R;
import com.lz.d_databind.databinding.ItemUsersBinding;
import com.lz.d_databind.listener.OnClickUserListener;
import com.lz.d_databind.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter {

    private List<User> list = new ArrayList<>();
    private Context context;
    private OnClickUserListener listener;
    public UserListAdapter(List<User> list, Context ctx, OnClickUserListener listener) {
        this.list = list;
        this.context = ctx;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemUsersBinding vdBind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_users, parent, false);

        return new VH(vdBind);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = list.get(position);
        VH vh = (VH) holder;
        vh.binding.setUser(user);
        vh.binding.setClickUser(listener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    private class VH extends RecyclerView.ViewHolder {

        public ItemUsersBinding binding;
        public VH(@NonNull ItemUsersBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
