package com.example.facapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Home extends AppCompatActivity {
    TextView month,logout;
    private TextView name;
    private FirebaseUser mauth;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        month = findViewById(R.id.month);
        logout = findViewById(R.id.logout);
        name = findViewById(R.id.Name);
        mauth = FirebaseAuth.getInstance().getCurrentUser();
        auth = FirebaseAuth.getInstance();
        if(mauth!=null)
        {
            name.setText(getname(mauth.getEmail().toString()));
        }
        Date currentTime = Calendar.getInstance().getTime();
        String formattedDate = DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);

        String[] splitDate = formattedDate.split(",");
        month.setText(splitDate[1]);
        AppCompatButton b = (AppCompatButton)findViewById(R.id.month);
            b.setOnClickListener(new View.OnClickListener() {
              public void onClick(View view){
                    Intent in = new Intent(Home.this, MyAadCalendar.class);
                    startActivity(in);
                }
            });

        CardView cv = (CardView)findViewById(R.id.attendanceCard);
        CardView cv2 = (CardView)findViewById(R.id.courseCard);
        CardView cv3 = (CardView)findViewById(R.id.marksCard);
        CardView cv4 = (CardView)findViewById(R.id.facultyCard);

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Home.this, Activity.class);
                    startActivity(intent);
                }
            });
            cv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Home.this,CoursesListActivity.class);
                    startActivity(intent);
                }
            });
            cv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Home.this, MarksListActivity.class);
                    startActivity(intent);
                }
            });

            cv4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Home.this, Faculty.class);
                    startActivity(intent);
                }
            });
                        logout.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                auth.signOut();
                                Intent intent = new Intent(Home.this,Login.class);
                                startActivity(intent);
                                finish();
                            }
                        });

    }
    public String getname(String n)
    {
        String[] num = n.split("@");
        StringBuilder builder = new StringBuilder(num[0]);
        builder.setCharAt(0,Character.toUpperCase(builder.charAt(0)));
        return builder.toString();
    }
}