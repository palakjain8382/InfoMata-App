package com.example.facapp;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
   public class Activity extends AppCompatActivity {

        private TextView attendance;
        private TextView status;
        private LinearLayoutCompat linearLayoutCompat;
        private CardView programmingCardView;
        private CardView appCardView;
        private CardView spmCardView;
        private CardView javaCardView;
        private CardView csharpCardView;
        private CardView databaseCardView;
        private TextView subjectTextView;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity);

            attendance = findViewById(R.id.attendance);
            status = (TextView) findViewById(R.id.status);

            linearLayoutCompat = findViewById(R.id.statusColor);


            programmingCardView =   (CardView) findViewById(R.id.programmingCardView);
            appCardView =           (CardView) findViewById(R.id.appCardView);
            spmCardView =           (CardView) findViewById(R.id.spmCardView);
            javaCardView =          (CardView) findViewById(R.id.javaCardView);
            csharpCardView =        (CardView) findViewById(R.id.csharpCardView);
            databaseCardView =      (CardView) findViewById(R.id.databaseCardView);
            subjectTextView =       (TextView) findViewById(R.id.subjectTextView);



            appCardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    Intent intent = createIntent("Mobile App Development", "Dr. Srinivasan P", "40", "10", "30", "10");
                    startActivity(intent);
                    return true;
                }
            });

            programmingCardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    Intent intent = createIntent("Programming", "Dr. Vijayan R", "20", "15", "18", "2");
                    startActivity(intent);
                    return true;
                }
            });

            spmCardView.setOnLongClickListener(view -> {
                Intent intent = createIntent("Software Process Matrix", "Uma Maheswari G", "30", "18", "20", "10");
                startActivity(intent);
                return true;
            });

            javaCardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {

                    Intent intent = createIntent("Java", "Dr. Shynu PG", "40", "32", "35", "5");
                    startActivity(intent);

                    return true;
                }
            });

            csharpCardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {

                    Intent intent = createIntent("C# Programming", "Sathiyamoorthy E", "30", "18", "20", "10");
                    startActivity(intent);

                    return true;
                }
            });

            databaseCardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {

                    Intent intent = createIntent("Database", "Dr. Swati Chauhan", "50", "42", "48", "2");
                    startActivity(intent);

                    return true;
                }
            });


        }

        public void programming(View view) {
            attendance.setText("80%");
            status.setText("Medium Attendance");
            linearLayoutCompat.setBackground(new ColorDrawable(getResources().getColor(R.color.medium)));
            subjectTextView.setText("Programming");
        }

        public void app(View view) {
            attendance.setText("67%");
            status.setText("Low Attendance");
            linearLayoutCompat.setBackground(new ColorDrawable(getResources().getColor(R.color.soft_red)));
            subjectTextView.setText("App Development");
        }

        public void spm(View view) {
            attendance.setText("95%");
            status.setText("High Attendance");
            linearLayoutCompat.setBackground(new ColorDrawable(getResources().getColor(R.color.high)));
            subjectTextView.setText("Software Process Matrix");
        }

        public void java(View view) {
            attendance.setText("87%");
            status.setText("Medium Attendance");
            linearLayoutCompat.setBackground(new ColorDrawable(getResources().getColor(R.color.medium)));
            subjectTextView.setText("Java");
        }

        public void csharp(View view) {
            attendance.setText("95%");
            status.setText("High Attendance");
            linearLayoutCompat.setBackground(new ColorDrawable(getResources().getColor(R.color.high)));
            subjectTextView.setText("C# Programming");
        }

        public void database(View view) {
            attendance.setText("87%");
            status.setText("Medium Attendance");
            linearLayoutCompat.setBackground(new ColorDrawable(getResources().getColor(R.color.medium)));
            subjectTextView.setText("Database");
        }


        private Intent createIntent(String subject, String faculty, String total, String totalAttendance, String completed, String classToAttend){
            Intent intent = new Intent(Activity.this,  AttendanceActivity.class);

            intent.putExtra("subject", subject);
            intent.putExtra("faculty", faculty);
            intent.putExtra("total", total);
            intent.putExtra("totalAttendance", totalAttendance);
            intent.putExtra("completed", completed);
            intent.putExtra("classToAttend", classToAttend);


            return intent;
        }

    }



