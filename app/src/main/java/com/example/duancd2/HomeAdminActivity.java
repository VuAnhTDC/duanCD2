package com.example.duancd2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;

public class HomeAdminActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
        setControl();
        setEvent();
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_homeadmin,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //    Anh xa
    private void setControl(){
        toolbar = findViewById(R.id.toolbar);
    }

//    Su kien
    private void setEvent(){

    }
}