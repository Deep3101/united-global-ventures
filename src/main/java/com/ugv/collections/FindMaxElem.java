package com.ugv.collections;

import java.util.Arrays;
import java.util.List;

public class FindMaxElem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 9, 4);

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}
