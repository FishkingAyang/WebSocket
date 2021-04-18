package com.ayang.websocket;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author Ayang
 * @date 2021/4/16 - 1:30
 */
public class Test {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getByName("localhost"));

//        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
//        System.out.println(inetAddress.getAddress());
//        System.out.println(inetAddress.getCanonicalHostName());
//        System.out.println(inetAddress.getHostAddress());
//        System.out.println(inetAddress.getHostName());


        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
        System.out.println("socketAddress = " + socketAddress);

        System.out.println(socketAddress.getAddress());
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getPort());


    }
}
