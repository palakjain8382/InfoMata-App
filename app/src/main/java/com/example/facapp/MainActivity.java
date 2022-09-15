package com.example.facapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = (Button) findViewById(R.id.backbutton);
        b.setOnClickListener(view -> onBackPressed());


        TextView t = (TextView) findViewById(R.id.mail);
    }

}