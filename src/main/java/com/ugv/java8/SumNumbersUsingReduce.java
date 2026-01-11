package com.ugv.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumNumbersUsingReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,5,9,5,6,9,55);

        int sum = list.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        long count = list.stream().filter(c -> c > 3).count();
        System.out.println(count);

        Optional<Integer> optional = list.stream().filter(c -> c > 3).findFirst();
        System.out.println(optional.orElse(-1));
    }
}
