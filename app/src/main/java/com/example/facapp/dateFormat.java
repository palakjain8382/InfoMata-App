package com.example.facapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateFormat extends AppCompatActivity {

    TextView month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_format);

        month = findViewById(R.id.month);


        Date currentTime = Calendar.getInstance().getTime();
        String formattedDate = DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);

        String[] splitDate = formattedDate.split(",");

        Log.d("myLOG", currentTime.toString());
        Log.d("myLOG", formattedDate);

        month.setText(splitDate[1]);
    }
}