package com.example.comscinotes.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.comscinotes.R;

import java.util.Objects;

public class login_activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}