package com.ayang.websocket.demo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author Ayang
 * @date 2021/4/17 - 22:24
 */
public class UdpClient {
    public static void main(String[] args) throws IOException {
       DatagramSocket socket =  new DatagramSocket();

       String msg = "你好，服务器！";


       InetAddress localhost = InetAddress.getByName("localhost");
       int port = 9090;

      DatagramPacket packet =  new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);

       socket.send(packet);

       socket.close();
    }
}
