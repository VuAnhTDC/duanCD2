package com.example.duancd2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;

import com.example.duancd2.fragment.MyViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class HomeAdminActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    MyViewPagerAdapter myViewPagerAdapter;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
        setControl();
        setIniatization();
        setEvent();
        setSupportActionBar(toolbar);
    }

    private void setIniatization() {
        myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_SET_USER_VISIBLE_HINT);
        viewPager.setAdapter(myViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_homeadmin,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //    Anh xa
    private void setControl(){
        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout_ScreenHome);
        viewPager = findViewById(R.id.viewPager_ScreenHome);
    }

//    Su kien
    private void setEvent(){

    }
}