package com.example.tcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.Dialogs.ErrorDialog;
import com.Tcp.Client;

public class MainActivity extends AppCompatActivity {
    Bundle args;
    Client client;
    EditText msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        args = getIntent().getExtras();
        client = new Client(args.getString("ip"), Integer.parseInt(args.getString("port")));
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = (EditText) findViewById(R.id.msg);

        if(client.CreateConnection(args.getString("name"))){
            showDialog("Проблемы с подключением...\n" + client.Ip + ":" + client.Port);
        }
    }

    public void showDialog(String description){
        ErrorDialog dialog = new ErrorDialog(description);
        dialog.show(getSupportFragmentManager(), "custom");
    }

    public void send(View v){
        client.SendString(msg.getText().toString());
    }
}