package com.example.practical_6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class second_main extends AppCompatActivity {
    TextView tvname,tvsub,tvbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        tvname = findViewById(R.id.tvname);
        tvsub = findViewById(R.id.tvsub);
        tvbook = findViewById(R.id.tvbook);
        tvname.setText("Name: "+getIntent().getExtras().getString("user"));
        tvsub.setText("Subject: "+getIntent().getExtras().getString("subject"));
        tvbook.setText("Book: "+getIntent().getExtras().getString("book")); }
    @Override
    public void onBackPressed() { }}
