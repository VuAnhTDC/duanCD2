package com.example.duancd2;

import android.util.Patterns;

import java.util.regex.Pattern;

public class Validate {

    public Validate() {

    }

    public boolean checkValueEmailAddress(String value){
        return Patterns.EMAIL_ADDRESS.matcher(value).matches();
    }
}
