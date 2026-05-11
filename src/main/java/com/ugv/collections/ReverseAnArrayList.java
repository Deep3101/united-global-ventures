package com.ugv.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> rev = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--){
            rev.add(list.get(i));
        }

        System.out.println(rev);
    }
}
