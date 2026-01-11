package com.ugv.collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountOccurrencesInLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        System.out.println(map);
    }
}
