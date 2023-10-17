package com.example.duancd2.Class;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duancd2.R;

import java.util.ArrayList;
import java.util.List;

public class ShopRegeterAdapter extends RecyclerView.Adapter<ShopRegeterViewHolder> {

    List<ShopRegeter> shopRegeterList = new ArrayList<>();
    Context context;

    public ShopRegeterAdapter(List<ShopRegeter> shopRegeterList, Context context){
        this.shopRegeterList = shopRegeterList;
        this.context = context;
    }
    @NonNull
    @Override
    public ShopRegeterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ShopRegeterViewHolder(LayoutInflater.from(context).inflate(R.layout.item_shopregeter_sreenhomeadmin,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ShopRegeterViewHolder holder, int position) {
        ShopRegeter shopRegeter = shopRegeterList.get(position);
        holder.tvUserNameRegeter.setText(shopRegeter.getUserNameRegeter());
        holder.tvUserNumberphoneRegeter.setText(shopRegeter.getNumberphoneUserRegeter());
        holder.tvUserEmailRegeter.setText(shopRegeter.getEmailUserRegeter());
        holder.tvUserAddressRegeter.setText(shopRegeter.getAddressUserRegeter());
        if (position % 2 == 0){
            holder.itemView.setBackgroundResource(R.drawable.bg_itemcustomer_01);
        }
        else {
            holder.itemView.setBackgroundResource(R.drawable.bg_itemcustomer_02);
        }
    }

    @Override
    public int getItemCount() {
        return shopRegeterList.size();
    }
}
