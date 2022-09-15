package com.example.facapp;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//import com.example.authentication.databinding.CoursesListScreenBinding;

import java.util.ArrayList;
import java.util.Objects;

public class CoursesListActivity extends AppCompatActivity {
   // CoursesListScreenBinding bind
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_list_screen);

        //Objects.requireNonNull(getSupportActionBar()).hide();

        final Context context = CoursesListActivity.this;

      //  binding = CoursesListScreenBinding.inflate(getLayoutInflater());

      //  setContentView(binding.getRoot());

        listView = findViewById(R.id.coursesListView);

        String[] subjects = {"Mobile Application Development", "Database Management Systems", "Object Oriented Programming", "Software Process Metrics", "Storage Systems and Management", "Machine Learning", "Data Mining", "Web Development"};
//        int[] marks = {99, 77, 88, 66, 55, 98, 98, 87};
        String[] subjectCodes = {"ITA5001", "ITA6012", "ITA4062", "MAT1002", "ITA1006", "BIT1245", "ITA4012", "ITA6006"};
        ArrayList<Course> coursesArrayList = new ArrayList<>();

        for (int i = 0; i < subjects.length; i++) {
            Course course = new Course(subjects[i], subjectCodes[i]);
            coursesArrayList.add(course);
        }

        CoursesListAdapter listAdapter = new CoursesListAdapter(CoursesListActivity.this, coursesArrayList);

        listView.setAdapter(listAdapter);
        listView.setClickable(false);

//        addListenerOnCloseButton();

        Button b = (Button) findViewById(R.id.backbutton);
        b.setOnClickListener(view -> onBackPressed());

    }

//    public void addListenerOnCloseButton() {
//        final Context context = this;
//
//        ImageView closeButton = (ImageView) findViewById(R.id.courseScreenCloseButton);
//
//        closeButton.setOnClickListener(view -> onBackPressed());
//    }
}
