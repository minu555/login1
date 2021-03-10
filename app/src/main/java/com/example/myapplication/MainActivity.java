package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, passwd;
    Button button, button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.text2);
        passwd = findViewById(R.id.edit1);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(user.getText().toString().equals("admin")&&passwd.getText().toString().equals("admin")){
                    startActivity (new Intent(MainActivity.this,success.class));


                }
                else{
                    Toast.makeText(getApplicationContext(), "login failed", Toast.LENGTH_SHORT).show();
                }




        }
        });
        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                            startActivity(new Intent(MainActivity.this, SignUp.class));








            }
        });}
}
