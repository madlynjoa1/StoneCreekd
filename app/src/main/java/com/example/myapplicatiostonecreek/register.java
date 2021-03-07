package com.example.myapplicatiostonecreek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class register extends AppCompatActivity {
    TextView mRegisterTitle, mUserType_tv, mFirstName_tv,mLastName_tv,mUserName_tv, mEmail_tv,
    mPassword_tv;
    EditText mFirstName_et,mLastName_et,mUsername_et,mEmail_et,mPassword_et;
    Spinner mUserTypeSpinner;
    Button mRegister_btn;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mRegisterTitle = findViewById(R.id.registerTitle);
        mUserType_tv = findViewById(R.id.userType_tv);
        mUserTypeSpinner = findViewById(R.id.userTypeSpinner);
        mFirstName_tv = findViewById(R.id.firstName_tv);
        mFirstName_et = findViewById(R.id.firstName_et);
        mLastName_tv = findViewById(R.id.lastName_tv);
        mLastName_et = findViewById(R.id.lastName_et);
        mUserName_tv = findViewById(R.id.username_tv);
        mUsername_et = findViewById(R.id.username_et);
        mEmail_tv = findViewById(R.id.email_tv);
        mEmail_et = findViewById(R.id.email_et);
        mPassword_tv = findViewById(R.id.password_tv);
        mPassword_et = findViewById(R.id.password_et);
        mRegister_btn = findViewById(R.id.register_btn);

        fAuth = FirebaseAuth.getInstance();


        mRegister_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = mEmail_et.getText().toString().trim();
                String Password = mPassword_et.getText().toString().trim();

                fAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Registration successful!", Toast.LENGTH_LONG).show();


                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Registration failed! Please try again later", Toast.LENGTH_LONG).show();

                        }
                    }
                });
            }
                });

            }
}






