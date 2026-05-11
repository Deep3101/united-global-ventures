package com.ugv.collections;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoHashMaps {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1, "A");

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(2, "B");

        m1.putAll(m2);

        System.out.println(m1);
    }
}
