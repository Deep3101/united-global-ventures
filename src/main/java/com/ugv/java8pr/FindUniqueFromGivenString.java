package com.ugv.java8pr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueFromGivenString {
    public static void main(String[] args) {
        String str = "My Name Is Deep Panchal";

        List<String> list = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Unique strings are : " + list);

    }
}
