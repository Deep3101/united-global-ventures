package com.ugv.java8pr;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartingWith1FromArray {
    public static void main(String[] args) {
        int[] num = {5, 11, 2, 4, 6, 9, 10, 1};

        List<String> list = Arrays.stream(num).boxed().map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .sorted()
                .toList();

        System.out.println(list);

    }
}
