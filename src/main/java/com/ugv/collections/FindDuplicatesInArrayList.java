package com.ugv.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,5,1,6);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer i : list){
            if (!seen.add(i)){
                duplicates.add(i);
            }
        }

        System.out.println("Duplicates are : " + duplicates);
    }
}
