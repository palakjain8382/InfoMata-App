package com.example.facapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ForgotPasswordScreenActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.forgot_password_screen);

        addListenerOnNextButton();

        addListenerOnCloseButton();
    }

    public void addListenerOnNextButton() {
        final Context context = this;

        Button nextButton = (Button) findViewById(R.id.resetButton);

        nextButton.setOnClickListener(view -> {
            Intent intent = new Intent(context, OTPScreenActivity.class);
            startActivity(intent);
        });
    }

    public void addListenerOnCloseButton() {
        final Context context = this;

        ImageView closeButton = (ImageView) findViewById(R.id.forgotPasswordCloseButton);

        closeButton.setOnClickListener(view -> onBackPressed());
    }
}
