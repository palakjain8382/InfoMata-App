package com.example.facapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register_student extends AppCompatActivity {

    private EditText email,pass;
    private MaterialButton reg;
    private TextView sigin;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_student);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        reg = findViewById(R.id.signUpButton);
        sigin = findViewById(R.id.signinButton);
        auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser()==null)
        {
            reg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    auth.createUserWithEmailAndPassword(email.getText().toString(),pass.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful())
                                    {
                                        Intent intent = new Intent(Register_student.this,Home.class);
                                        startActivity(intent);
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_LONG).show();
                                }
                            });


                }
            });


        }
        else
        {
            Intent intent = new Intent(Register_student.this,Home.class);
            startActivity(intent);
        }

        sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_student.this,Login.class);
                startActivity(intent);
            }
        });
    }
}