package com.Tcp;

import java.io.IOException;
import java.net.*;
import java.io.*;
import java.nio.charset.Charset;

public class Client {
    String Ip;
    int Port;
    Socket socket;
    OutputStream out;

    public Client(String Ip, int Port) {
        this.Ip = Ip;
        this.Port = Port;
    }

    public boolean CreateConnection(){
        try{
            socket = new Socket(Ip, Port);
            out = socket.getOutputStream();
            return true;
        } catch (UnknownHostException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean SendString(String str){
        try {
            out.write(str.getBytes(Charset.forName("utf-8")));
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
