package com.ugv.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplFromArrayListWithoutSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> integerList = new ArrayList<>();

        for (Integer i : list){
            if (!integerList.contains(i)){
                integerList.add(i);
            }
        }

        System.out.println(integerList);
    }
}
