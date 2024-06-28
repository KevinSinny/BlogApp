package com.example.blogapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddPost extends AppCompatActivity {
    //EditText ed1,ed2;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_post);
        /*SharedPreferences pref=getSharedPreferences("Login",MODE_PRIVATE);
        String username=pref.getString("user",null);
        if(username!=null)
        {
            Intent i=new Intent(getApplicationContext(),AddPost.class) ;
            startActivity(i);
        }*/
        b1=(AppCompatButton)  findViewById(R.id.add);
        b2=(AppCompatButton)  findViewById(R.id.b2m);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"post added",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref=getSharedPreferences("Login",MODE_PRIVATE);
                SharedPreferences.Editor editor=pref.edit();
                editor.clear();
                editor.apply();
                Intent i=new Intent(getApplicationContext(), Menu.class);
                startActivity(i);
            }
        });
    }
}