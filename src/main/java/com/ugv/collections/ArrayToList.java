package com.ugv.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        List<String> list = Arrays.asList(arr);

        System.out.println(list);
    }
}
