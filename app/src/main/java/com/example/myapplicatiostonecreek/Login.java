package com.example.myapplicatiostonecreek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    Button login;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login_btn);
        register = findViewById(R.id.register_link);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inside here we put from where we start to what activity we continue to
                Intent intent = new Intent(Login.this, User.class);
                startActivity(intent);

            }
        });

        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, register.class);
                startActivity(intent);
            }
        });

    }
}
