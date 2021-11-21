package com.example.tcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void SignIn(View v){
        Intent I = new Intent(this, MainActivity.class);
        I.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(I);
    }
}