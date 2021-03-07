package com.example.myapplicatiostonecreek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class User extends AppCompatActivity {

    TextView seeMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        seeMore = findViewById(R.id.services_tv);

        seeMore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, Services.class);
                startActivity(intent);
            }
        });


    }

}


