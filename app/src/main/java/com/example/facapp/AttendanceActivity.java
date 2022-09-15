package com.example.facapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class AttendanceActivity extends AppCompatActivity {

    private PieChart piechart;

    private TextView subject;
    private TextView faculty;
    private TextView totalClasses;
    private TextView classCompleted;
    private TextView classAttended;
    private TextView classToAttend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);


        initViews();

        String subjectData = getIntent().getStringExtra("subject");
        String facultyData = getIntent().getStringExtra("faculty");
        String totalData = getIntent().getStringExtra("total");
        String totalAttendanceData = getIntent().getStringExtra("totalAttendance");
        String completedData = getIntent().getStringExtra("completed");
        String classToAttendData = getIntent().getStringExtra("classToAttend");

        piechart.addPieSlice(new PieModel("Class To Attend", Integer.parseInt(classToAttendData), Color.parseColor("#FE6DA8")));
        piechart.addPieSlice(new PieModel("Total Class Conducted", Integer.parseInt(totalData), Color.parseColor("#56B7F1")));
        piechart.addPieSlice(new PieModel("Class Attended", Integer.parseInt(totalAttendanceData), Color.parseColor("#2ecc71")));


        piechart.startAnimation();


        subject.setText(subjectData);
        faculty.setText(facultyData);
        totalClasses.setText(totalData);
        classCompleted.setText(completedData);
        classToAttend.setText(classToAttendData);
        classAttended.setText(totalAttendanceData);

        Button b = (Button) findViewById(R.id.backbutton);
        b.setOnClickListener(view -> onBackPressed());

    }


    public void initViews(){
        piechart = (PieChart) findViewById(R.id.piechart);

        subject = (TextView) findViewById(R.id.subject);
        faculty = (TextView) findViewById(R.id.faculty);
        totalClasses = (TextView) findViewById(R.id.totalClasses);
        classCompleted = (TextView) findViewById(R.id.classCompleted);
        classAttended = (TextView) findViewById(R.id.classAttended);
        classToAttend = (TextView) findViewById(R.id.classToAttend);
    }

}