package com.example.duancd2.Class;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duancd2.R;

public class ShopRegeterViewHolder extends RecyclerView.ViewHolder {

    ImageView ivShopRegeter;
    TextView tvUserNameRegeter, tvUserNumberphoneRegeter, tvUserEmailRegeter, tvUserAddressRegeter;
    LinearLayout vItemCustomer_shopregeter;
    public ShopRegeterViewHolder(@NonNull View itemView) {
        super(itemView);
        ivShopRegeter = itemView.findViewById(R.id.ivItemShopregeter);
        tvUserNameRegeter = itemView.findViewById(R.id.tvuserNameRegeter);
        tvUserNumberphoneRegeter = itemView.findViewById(R.id.tvuserNumberphoneRegeter);
        tvUserEmailRegeter = itemView.findViewById(R.id.tvuserEmailRegeter);
        tvUserAddressRegeter = itemView.findViewById(R.id.tvuserAddressRegeter);
        vItemCustomer_shopregeter = itemView.findViewById(R.id.vItemCustomer_shopregeter);
    }
}
