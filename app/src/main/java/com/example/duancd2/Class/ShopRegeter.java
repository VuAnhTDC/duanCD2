package com.example.duancd2.Class;

public class ShopRegeter {
    private String userNameRegeter;

    private String numberphoneUserRegeter;

    private String emailUserRegeter;

    private String addressUserRegeter;

    public ShopRegeter() {
    }

    public String getUserNameRegeter() {
        return userNameRegeter;
    }

    public void setUserNameRegeter(String userNameRegeter) {
        this.userNameRegeter = userNameRegeter;
    }

    public String getNumberphoneUserRegeter() {
        return numberphoneUserRegeter;
    }

    public void setNumberphoneUserRegeter(String numberphoneUserRegeter) {
        this.numberphoneUserRegeter = numberphoneUserRegeter;
    }

    public String getEmailUserRegeter() {
        return emailUserRegeter;
    }

    public void setEmailUserRegeter(String emailUserRegeter) {
        this.emailUserRegeter = emailUserRegeter;
    }

    public String getAddressUserRegeter() {
        return addressUserRegeter;
    }

    public void setAddressUserRegeter(String addressUserRegeter) {
        this.addressUserRegeter = addressUserRegeter;
    }

    public ShopRegeter(String userNameRegeter, String numberphoneUserRegeter, String emailUserRegeter, String addressUserRegeter) {
        this.userNameRegeter = userNameRegeter;
        this.numberphoneUserRegeter = numberphoneUserRegeter;
        this.emailUserRegeter = emailUserRegeter;
        this.addressUserRegeter = addressUserRegeter;
    }
}
