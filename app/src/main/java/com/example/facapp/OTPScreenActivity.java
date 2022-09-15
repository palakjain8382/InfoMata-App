package com.example.facapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class OTPScreenActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.enter_otp_screen);

        addListenerOnOTPScreenNextButton();

        addListenerOnCloseButton();
    }

    public void addListenerOnOTPScreenNextButton() {
        final Context context = this;

        Button nextButton = (Button) findViewById(R.id.otpScreenNextButton);

        nextButton.setOnClickListener(view -> {
            Intent intent = new Intent(context, NewPasswordScreenActivity.class);
            startActivity(intent);
        });
    }

    public void addListenerOnCloseButton() {
        final Context context = this;

        ImageView closeButton = (ImageView) findViewById(R.id.otpScreenCloseButton);

        closeButton.setOnClickListener(view -> onBackPressed());
    }
}
