package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class LecturerLogin extends AppCompatActivity {

    Button mLoginButton;
    Button mForgotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_login);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Lecturer");*/

        mLoginButton = (Button) findViewById(R.id.lecturer_login_button);
        mForgotButton = (Button) findViewById(R.id.lecturer_forgot_password);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LecturerLogin.this, LecturerReference.class);
                startActivity(intent);
            }
        });

    }
}
