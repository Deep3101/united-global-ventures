package com.ugv;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collections.sort(list);
        System.out.println(list);

        Comparator<Object> comparator = Collections.reverseOrder();
        list.sort(comparator);
        System.out.println(list);
    }
}
