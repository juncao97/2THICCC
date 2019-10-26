package com.example.a2thiccc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//TODO: everything lol
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button loginButton = findViewById(R.id.loginButton);
        final Button createUserButton = findViewById(R.id.newUserButton);

        //login service
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextA = new Intent(LoginActivity.this, MainActivity.class);
                startActivityForResult(nextA, 10);
            }
        });
        //new User Service
        createUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //...........
                //open new user creation dialog here
                //...........
            }
        });

    }
}
