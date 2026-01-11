package com.ugv;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfElem {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 44, 11, 3, 6, 2, 5, 4, 6, 1};

        HashMap<Integer,Integer> map = new HashMap<>();

//        for (int j : arr) {
//            if (map.containsKey(j)) {
//                map.put(j, map.get(j) + 1);
//            } else {
//                map.put(j, 1);
//            }
//        }

        for (int j : arr){
            map.put(j,map.getOrDefault(j,0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
