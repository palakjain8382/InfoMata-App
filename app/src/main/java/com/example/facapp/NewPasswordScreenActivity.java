package com.example.facapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class NewPasswordScreenActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.new_password_screen);

        addListenerOnResetButton();

        addListenerOnCloseButton();
    }

    public void addListenerOnResetButton() {
        final Context context = this;

        Button resetButton = (Button) findViewById(R.id.resetButton);

        resetButton.setOnClickListener(view -> {
            Intent intent = new Intent(context, Login.class);
            startActivity(intent);
        });
    }

    public void addListenerOnCloseButton() {
        final Context context = this;

        ImageView closeButton = (ImageView) findViewById(R.id.newPasswordCloseButton);

        closeButton.setOnClickListener(view -> onBackPressed());
    }
}
