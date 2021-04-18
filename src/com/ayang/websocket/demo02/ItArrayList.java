package com.ayang.websocket.demo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ayang
 * @date 2021/4/17 - 14:46
 */
public class ItArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        for(int a : list) {
//
//        }
//        for (int i = 0; i < list.size(); i++) {
//            int a = list.get(i);
//        }
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()) {
//            it.remove();
//        }
//        list.forEach();

        list = list.stream().filter(n -> n != 2).collect(Collectors.toList());
        list.forEach(System.out::println);

        //collect.forEach(System.out::println);
    }
}
