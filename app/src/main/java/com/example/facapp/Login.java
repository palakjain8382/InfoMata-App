package com.example.facapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    private EditText email,pass;
//    private Button login,reg;
    private FirebaseAuth auth;
    private TextView register;
    private MaterialButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser()==null) {
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    auth.signInWithEmailAndPassword(email.getText().toString(), pass.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Intent intent = new Intent(Login.this, Home.class);
                                        startActivity(intent);
                                    }
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(getApplicationContext(), "" + e, Toast.LENGTH_LONG).show();
                                }
                            });
                }
            });
        }
        else
        {
            Intent intent = new Intent(Login.this,Home.class);
            startActivity(intent);
        }
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Register_student.class);
                startActivity(intent);
            }
        });

    }
}