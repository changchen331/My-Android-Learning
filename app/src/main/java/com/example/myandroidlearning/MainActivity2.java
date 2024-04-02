package com.example.myandroidlearning;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
