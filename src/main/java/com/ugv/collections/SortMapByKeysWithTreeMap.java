package com.ugv.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeysWithTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        Map<Integer, String> sorted = new TreeMap<>(map);

        System.out.println(sorted);
    }
}
