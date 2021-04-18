package com.ayang.websocket.demo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author Ayang
 * @date 2021/4/18 - 1:28
 */
public class TalkReceive implements Runnable{

    DatagramSocket socket = null;
    private int port;
    private String msgFrom;

    public TalkReceive(int port, String msgFrom) throws SocketException {
        this.port = port;
        this.msgFrom = msgFrom;
        socket = new DatagramSocket(port);
    }

    @Override
    public void run() {
        while (true) {
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            try {
                socket.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, data.length);
            System.out.println(msgFrom + ": " + receiveData);
            if(receiveData.trim().equals("bye")) {
                break;
            }

        }

        socket.close();
    }
}
