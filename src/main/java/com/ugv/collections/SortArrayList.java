package com.ugv.collections;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 5, 2, 9, 6, 3, 2, 1);
        Collections.sort(list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
