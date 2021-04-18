package com.ayang.websocket.demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.Buffer;

/**
 * @author Ayang
 * @date 2021/4/18 - 0:38
 */
public class UdpChat02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String data = reader.readLine();
            byte[] datas = data.getBytes();
            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("localhost", 6666));

            socket.send(packet);
            if(data.trim().equals("bye")) break;
        }
        System.in.close();
        socket.close();
    }
}
