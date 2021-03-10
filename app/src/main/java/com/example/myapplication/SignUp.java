package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText fullname,email,mobile,password;
    Button button,show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        fullname=findViewById(R.id.fname);

        email=findViewById(R.id.email);
        mobile=findViewById(R.id.mobile);
        password=findViewById(R.id.password);


        button=findViewById(R.id.button);
        show=findViewById(R.id.show);

        button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(fullname.length()==0)
                        {
                            fullname.requestFocus();
                            fullname.setError("FIELD CANNOT BE EMPTY");
                        }


                        else if(email.length()==0)
                        {
                            email.requestFocus();
                            email.setError("FIELD CANNOT BE EMPTY");

                        }
                        else if(mobile.length()==0)
                        {
                            mobile.requestFocus();
                            mobile.setError("FIELD CANNOT BE EMPTY");
                        }
                        else if(password.length()==0)
                        {
                            password.requestFocus();
                            password.setError("FIELD CANNOT BE EMPTY");
                        }

                        else
                        {
                            startActivity(new Intent(SignUp.this, MainActivity.class));
                        }
                    }
        });


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=fullname.getText().toString();
                String useremail=email.getText().toString();
                String usermobile=mobile.getText().toString();
                String userpass=password.getText().toString();
                Intent intent=new Intent(SignUp.this,MainActivity2.class);
                intent.putExtra("full_name",username);
                intent.putExtra("e_mail",useremail);
                intent.putExtra("m_obile",usermobile);
                intent.putExtra("pass_word",userpass);
                startActivity(intent);




            }
        });








    }
}