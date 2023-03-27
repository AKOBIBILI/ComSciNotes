package com.example.comscinotes.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.comscinotes.R;

import java.util.Objects;

public class choose_login_activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login);

        Button btn_login = findViewById(R.id.btn_login);
        Button btn_signup = findViewById(R.id.btn_signup);

        btn_login.setOnClickListener(view -> startActivity(new Intent(choose_login_activity.this, login_activity.class)));
        btn_signup.setOnClickListener(view -> startActivity(new Intent(choose_login_activity.this, activity_signup.class)));
    }
}