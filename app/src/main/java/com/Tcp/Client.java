package com.Tcp;

import android.os.NetworkOnMainThreadException;

import java.io.IOException;
import java.net.*;
import java.io.*;
import java.nio.charset.Charset;

public class Client {
    public String Ip;
    public int Port;
    private String name;
    private Socket socket;
    private OutputStream out;

    public Client(String Ip, int Port) {
        this.Ip = Ip;
        this.Port = Port;
    }

    public boolean CreateConnection(String name){
        this.name = name;
        try{
            socket = new Socket(Ip, Port);
            out = socket.getOutputStream();
            return false;
        } catch (NetworkOnMainThreadException e) {
            return true;
        } catch (IOException e) {
            return true;
        }
    }

    public boolean SendString(String str){
        try {
            out.write(str.getBytes(Charset.forName("utf-8")));
            return false;
        } catch (IOException e) {
            return true;
        }
    }
}
