package com.example.duancd2.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duancd2.Class.ShopRegeter;
import com.example.duancd2.Class.ShopRegeterAdapter;
import com.example.duancd2.R;

import java.util.ArrayList;

public class ListShopFragment extends Fragment {

    RecyclerView rcvShopRegeterList;

    ArrayList<ShopRegeter> shopRegeters = new ArrayList<>();
    ShopRegeterAdapter shopRegeterAdapter;
    Context context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_listshop_admin,container,false);
        setControl(view);
        setItiniazation();

        return view;
    }

    private void setItiniazation() {
        ShopRegeter shopRegeter1 = new ShopRegeter("User 1","0987654321","user1@gmail.com","ap phuoc le, xa thanh trieu, huyen chau thanh, tinh ben tre");
        ShopRegeter shopRegeter2 = new ShopRegeter("User 2","0997654321","user2@gmail.com","ap phuoc le, xa thanh trieu, huyen chau thanh, tinh ben tre2");
        ShopRegeter shopRegeter3 = new ShopRegeter("User 3","0999654321","user3@gmail.com","ap phuoc le, xa thanh trieu, huyen chau thanh, tinh ben tre3");
        shopRegeters.add(shopRegeter1);
        shopRegeters.add(shopRegeter2);
        shopRegeters.add(shopRegeter3);
        shopRegeterAdapter = new ShopRegeterAdapter(shopRegeters,getContext());
        rcvShopRegeterList.setLayoutManager(new LinearLayoutManager(getContext()));
        rcvShopRegeterList.setAdapter(shopRegeterAdapter);

    }

    private void setControl(View view) {
        rcvShopRegeterList = view.findViewById(R.id.rcvListShop);
    }

}
