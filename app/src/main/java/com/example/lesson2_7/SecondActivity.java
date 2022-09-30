package com.example.lesson2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = getIntent().getStringExtra("key1");
        TextView textView = findViewById(R.id.text_police);
        textView.setText(text);


    }

    public void exportClick(View view) {
        finish();
    }
}