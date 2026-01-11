package com.ugv;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElemInArr {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5, 2};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
//            if (entry.getValue() > 1){
//                System.out.println(entry.getKey() + " ");
//            }
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " ");
            }
        }
    }
}
