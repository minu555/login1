package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text1,text3,text4;
    EditText text2;
    String fullname1,email1,mobile1,pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        fullname1=intent.getStringExtra("full_name");
        email1=intent.getStringExtra("e_mail");
        mobile1=intent.getStringExtra("m_obile");
        pass1=intent.getStringExtra("pass_word");
        getSupportActionBar().setTitle(fullname1);
        text1.setText(email1);




    }
}