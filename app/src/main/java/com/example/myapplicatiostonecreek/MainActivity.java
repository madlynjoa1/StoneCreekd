package com.example.myapplicatiostonecreek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button registerButton;
    EditText userET;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.loginbtn);
        registerButton = findViewById(R.id.regisbtn);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inside here we put from where we start to what activity we continue to
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);

            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent = new Intent(MainActivity.this, register.class);
                startActivity(regIntent);
            }
        });
  }
}
