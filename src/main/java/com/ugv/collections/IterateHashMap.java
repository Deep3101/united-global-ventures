package com.ugv.collections;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");

        for (Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
