package com.example.facapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SignUpScreenActivity  extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.signup_screen);

        addListenerButton();
    }

    public void addListenerButton() {
        final Context context = this;

        TextView logIn = (TextView) findViewById(R.id.signin);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args) {
                Intent intent = new Intent(context, Login.class);
                startActivity(intent);
            }
        });
    }
}
