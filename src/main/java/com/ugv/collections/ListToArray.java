package com.ugv.collections;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 5, 9, 6, 9);

        Object[] object = list.toArray();

        for (Object o : object) {
            System.out.println(o);
        }
    }
}
