package com.ayang.websocket.demo4;

import java.net.SocketException;

/**
 * @author Ayang
 * @date 2021/4/18 - 1:36
 */
public class TalkB {
    public static void main(String[] args) throws SocketException {
        new Thread(new TalkSend(6666,"localhost", 8888)).start();
        new Thread(new TalkReceive(9999, "A")).start();
    }
}
