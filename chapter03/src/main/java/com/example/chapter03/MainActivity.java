package com.example.chapter03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.jump_to_activity_text_view);
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, TextColorActivity.class);
            startActivity(intent);
        });
    }
}