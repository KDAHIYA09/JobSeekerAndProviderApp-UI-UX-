package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ChangeNumber extends AppCompatActivity {
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_number);
        getSupportActionBar().hide();

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.update);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangeNumber.this, Sign_In_Activity.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChangeNumber.this, "Number updated", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ChangeNumber.this, Explore_Screen.class);
                startActivity(intent);
            }
        });

    }
}