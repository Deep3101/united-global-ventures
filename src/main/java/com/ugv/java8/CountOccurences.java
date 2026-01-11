package com.ugv.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurences {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "a", "a", "b", "c", "c", "d", "e", "e");

        Map<String, Long> counts = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(counts);

    }
}
