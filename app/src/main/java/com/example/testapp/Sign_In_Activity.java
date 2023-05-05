package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_In_Activity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        button = findViewById(R.id.btn);
        textView = findViewById(R.id.tv);
        etPassword = findViewById(R.id.etPassword);

        getSupportActionBar().hide();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etPassword.getText().toString().isEmpty()){
                    etPassword.setError("Please enter valid phone number");
                    return;
                }

                Intent intent = new Intent(Sign_In_Activity.this, Explore_Screen.class);
                startActivity(intent);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_In_Activity.this, ChangeNumber.class);
                startActivity(intent);
            }
        });

    }
}