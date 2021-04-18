package com.ayang.websocket.demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Ayang
 * @date 2021/4/16 - 2:00
 */
public class TCPClientDemo1 {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;

            socket = new Socket(serverIP, port);

             os = socket.getOutputStream();
            os.write("你好，我是阿阳".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            os.close();
            socket.close();
        }

    }
}
