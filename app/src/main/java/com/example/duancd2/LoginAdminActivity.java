package com.example.duancd2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.input.InputManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginAdminActivity extends AppCompatActivity {

    LinearLayout vMain;
    Context context;

    TextInputEditText inputEmail, inputPassword;

    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        setControl();
        setEvent();
        context = this;
    }

    //    Anh xa
    private void setControl() {
        vMain = findViewById(R.id.vMain);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        btnConfirm = findViewById(R.id.btnLogin);
    }

    //    Su kien
    private void setEvent() {
        vMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideKeyboard();
            }
        });

        inputEmail.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_DONE) {
                    if (checkValueInputEmail()) {
                        inputPassword.requestFocus();
                    }
                }
                return false;
            }
        });

        inputPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_DONE) {
                    if (checkValueInputPassword()) {
                        hideKeyboard();
                    }
                }
                return false;
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkValueInputEmail() || !checkValueInputPassword()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setTitle("Thông báo")
                            .setMessage("Vui lòng kiểm tra giá trị nhập vào")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {

                }
            }
        });


    }

    //    ham an ban phim
    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private boolean checkValueInputEmail() {
        Validate validate = new Validate();
        if (!validate.checkValueEmailAddress(inputEmail.getText().toString())) {
            inputEmail.setError("Email không hợp lệ");
            return false;
        }
        return true;
    }

    private boolean checkValueInputPassword() {
        if (inputPassword.getText().length() < 8) {
            inputPassword.setError("Mật khẩu ít nhất 8 ký tự");
            return false;
        }
        return true;
    }

    private boolean checkValidateValueBeforeClickConfirm() {
        Validate validate = new Validate();
        if (validate.checkValueEmailAddress(inputEmail.getText().toString()) && inputPassword.getText().toString().length() >= 8) {
            return true;
        }
        return false;
    }
}