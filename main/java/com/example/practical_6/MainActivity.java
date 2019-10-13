package com.example.practical_6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etname;
    RadioGroup radiosub,radiobook;
    Button btn;
    RadioButton radioSubbtn,radiobookbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = findViewById(R.id.etname);
        radiosub = findViewById(R.id.radiogrp);
        radiobook = findViewById(R.id.radiobook);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second_main.class);
                intent.putExtra("user",etname.getText().toString());
                startActivity(intent);
                int selectedId = radiosub.getCheckedRadioButtonId();
                radioSubbtn =  findViewById(selectedId);
                if(selectedId==-1){Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show(); }
                else{ intent.putExtra("subject",radioSubbtn.getText().toString());
                    startActivity(intent); }
                int bookid =  radiobook.getCheckedRadioButtonId();
                radiobookbtn = findViewById(bookid);
                if (bookid==0){ Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show(); }
                else { intent.putExtra("book",radiobookbtn.getText().toString());
                    startActivity(intent); } }}); }}
