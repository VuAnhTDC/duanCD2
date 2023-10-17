package com.example.duancd2.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

    public MyViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ListShopFragment();
            case 1:
                return new ListShipperFragment();
            default:
                return new ListShopFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String titileTabLayout = "";
        switch (position){
            case 0:
                titileTabLayout = "Đơn đăng ký bán hàng";
                break;
            case 1:
                titileTabLayout = "Đơn đăng ký giao hàng";
                break;
        }
        return titileTabLayout;
    }
}
