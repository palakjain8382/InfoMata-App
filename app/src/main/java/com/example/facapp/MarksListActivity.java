package com.example.facapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

//import com.example.facapp.databinding.MarksListScreenBinding;
import java.util.ArrayList;
import java.util.Objects;

public class MarksListActivity extends AppCompatActivity {
//    MarksListScreenBinding binding;
    private ListView marks_list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marks_list_screen);
        marks_list = findViewById(R.id.marksListView);

        final Context context = MarksListActivity.this;

        String[] subjects = {"Mobile Application Development", "Database Management Systems", "Object Oriented Programming", "Software Process Metrics", "Storage Systems and Management", "Machine Learning", "Data Mining", "Web Development"};
        int[] marks = {99, 77, 88, 66, 55, 98, 98, 87};

        ArrayList<Marks> marksArrayList = new ArrayList<>();

        for (int i = 0; i < subjects.length; i++) {
            Marks subjectMarks = new Marks(subjects[i], marks[i]);
            marksArrayList.add(subjectMarks);
        }

        ListAdapter listAdapter = new ListAdapter(MarksListActivity.this, marksArrayList);
        marks_list.setAdapter(listAdapter);
        Button b = (Button) findViewById(R.id.backbutton);
        b.setOnClickListener(view -> onBackPressed());
//        addListenerOnCloseButton();
    }

//    public void addListenerOnCloseButton() {
//        final Context context = this;
//
//        ImageView closeButton = (ImageView) findViewById(R.id.marksScreenCloseButton);
//
//        closeButton.setOnClickListener(view -> onBackPressed());
//    }
}
