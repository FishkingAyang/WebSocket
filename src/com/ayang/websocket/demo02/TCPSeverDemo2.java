package com.ayang.websocket.demo02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

/**
 * @author Ayang
 * @date 2021/4/16 - 2:00
 */
public class TCPSeverDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            is = socket.getInputStream();
            TreeSet<Integer> set = new TreeSet<>();

            bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.print(currentTime() + "  ");
            System.out.println(bos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bos.close();
            is.close();
            socket.close();
            serverSocket.close();
        }

    }

    public static String currentTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
}
