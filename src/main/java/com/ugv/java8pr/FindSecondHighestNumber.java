package com.ugv.java8pr;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,8,2,3,6,9,11,52,21};

        Integer secondHighestNumber = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println(secondHighestNumber);

    }
}
