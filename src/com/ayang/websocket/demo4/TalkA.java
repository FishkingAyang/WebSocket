package com.ayang.websocket.demo4;

import java.net.SocketException;

/**
 * @author Ayang
 * @date 2021/4/18 - 1:36
 */
public class TalkA {
    public static void main(String[] args) throws SocketException {
        new Thread(new TalkSend(7777,"localhost", 9999)).start();
        new Thread(new TalkReceive(8888, "B")).start();
    }
}
