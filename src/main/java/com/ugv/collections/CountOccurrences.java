package com.ugv.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Banana");
        list.add("Carrom");
        list.add("Dog");
        list.add("Elephant");

        Map<String, Integer> map = new HashMap<>();

        for (String l : list) {
            if (map.containsKey(l)) {
                map.put(l, map.get(l) + 1);
            } else {
                map.put(l, 1);
            }
        }
        System.out.println(map);
    }
}
