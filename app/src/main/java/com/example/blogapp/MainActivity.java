package com.example.blogapp;

import android.content.Intent;
import android.content.SharedPreferences;
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

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    AppCompatButton b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SharedPreferences pref=getSharedPreferences("Login",MODE_PRIVATE);
        String username=pref.getString("user",null);
        if(username!=null)
        {
            Intent i=new Intent(getApplicationContext(),Menu.class) ;
            startActivity(i);
        }
        e1 = (EditText) findViewById(R.id.uname);
        e2 = (EditText) findViewById(R.id.upass);
        b1 = (AppCompatButton) findViewById(R.id.sin);
        b2 = (AppCompatButton) findViewById(R.id.sup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String getUsername = e1.getText().toString();
                    String getpassword = e2.getText().toString();
                    if (getUsername.equals("kevin") && getpassword.equals("12345")) {
                        SharedPreferences pref = getSharedPreferences("Login", MODE_PRIVATE);
                        SharedPreferences.Editor editor = pref.edit();
                        editor.putString("user", "kevin");
                        editor.apply();
                        Intent i = new Intent(getApplicationContext(), Menu.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(getApplicationContext(), "Username and Password does not exist", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter both the inputs", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), SignUp.class);
                        startActivity(i);
            }
        });
    }
}

