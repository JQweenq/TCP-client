package com.example.tcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.Dialogs.ErrorDialog;

public class LoginActivity extends AppCompatActivity {

    EditText name;
    EditText ip;
    EditText port;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = (EditText)findViewById(R.id.name);
        ip = (EditText)findViewById(R.id.ip);
        port = (EditText)findViewById(R.id.port);

    }

    public void SignIn(View v){
        if(!name.getText().toString().equals("") && !ip.getText().toString().equals("") && !port.getText().toString().equals("") && Integer.parseInt(port.getText().toString()) != 0){
            Intent I = new Intent(this, MainActivity.class);
            I.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(I);
        }
        else showDialog();
    }

    public void showDialog(){
        ErrorDialog dialog = new ErrorDialog();
        dialog.show(getSupportFragmentManager(), "custom");
    }
}