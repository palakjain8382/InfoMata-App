package com.example.facapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Faculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        CardView cv = (CardView)findViewById(R.id.fac1);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Faculty.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView cv2 = (CardView)findViewById(R.id.fac2);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Faculty.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView cv3 = (CardView)findViewById(R.id.fac3);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Faculty.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView cv4 = (CardView)findViewById(R.id.fac4);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Faculty.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView cv5 = (CardView)findViewById(R.id.fac5);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Faculty.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView cv6 = (CardView)findViewById(R.id.fac6);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Faculty.this, MainActivity.class);
                startActivity(intent);
            }
        });


        Button b = (Button) findViewById(R.id.backbutton);
        b.setOnClickListener(view -> onBackPressed());
    }
}