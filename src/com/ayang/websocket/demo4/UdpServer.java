package com.ayang.websocket.demo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author Ayang
 * @date 2021/4/17 - 22:29
 */
public class UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);

        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
        socket.receive(packet);
        System.out.println(packet.getAddress().getHostAddress());

        System.out.println(new String(packet.getData(),0,packet.getLength()));

        socket.close();
    }
    
}
