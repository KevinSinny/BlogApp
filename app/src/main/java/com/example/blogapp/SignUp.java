package com.example.blogapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed5,ed6,ed7,ed8;
    AppCompatButton bt1,bt2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ed1=(EditText) findViewById(R.id.pname);
        ed2=(EditText) findViewById(R.id.page);
        ed3=(EditText) findViewById(R.id.Hname);
        ed5=(EditText) findViewById(R.id.phoneNo);
        ed6=(EditText) findViewById(R.id.uname);
        ed7=(EditText) findViewById(R.id.upass);
        ed8=(EditText) findViewById(R.id.conpass);
        bt1=(AppCompatButton) findViewById(R.id.reg2btn);
        bt2=(AppCompatButton) findViewById(R.id.bck2logbtn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getPatientname=ed1.getText().toString();
                String getAge=ed2.getText().toString();
                String getHouseName=ed3.getText().toString();
                String getMobileNo=ed5.getText().toString();
                String getUserName=ed6.getText().toString();
                String getPassword=ed7.getText().toString();
                String getConfirmpassword=ed8.getText().toString();
                Toast.makeText(getApplicationContext(),getPatientname+" "+getAge+" "+getHouseName+" "+getMobileNo+" "+getUserName+" "+getPassword+" "+getConfirmpassword,Toast.LENGTH_SHORT).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    };
}