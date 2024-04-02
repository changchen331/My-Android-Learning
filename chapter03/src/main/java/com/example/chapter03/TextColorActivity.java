package com.example.chapter03;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);
        TextView tv_red = findViewById(R.id.tv_cyan);
        tv_red.setTextColor(Color.CYAN);

        TextView tv_background = findViewById(R.id.tv_background_blue);
//        tv_background.setBackgroundColor(Color.BLUE);
        tv_background.setBackgroundResource(R.color.blue);
    }
}