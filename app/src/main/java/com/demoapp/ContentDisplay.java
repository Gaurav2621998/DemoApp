package com.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContentDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_display);
        String st = getIntent().getStringExtra("content");
        Toast.makeText(getApplicationContext(),st,Toast.LENGTH_SHORT).show();

    }
}
