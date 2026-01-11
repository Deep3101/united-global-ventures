package com.ugv.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesInArrayListWithoutSet {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 1, 2, 5, 6, 8, 3, 6, 5, 2, 9);

        List<Integer> dupl = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    if (!dupl.contains(list.get(i))) {
                        dupl.add(list.get(i));
                    }
                }
            }
        }

        System.out.println("Duplicates are : " + dupl);
    }
}
