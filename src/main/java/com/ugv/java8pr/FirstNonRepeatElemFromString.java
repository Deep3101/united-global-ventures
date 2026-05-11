package com.ugv.java8pr;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElemFromString {
    public static void main(String[] args) {
        String str = "My Name Is Deep Panchal";

        String key = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)// first non repeat elem
                .findFirst().map(Map.Entry::getKey).orElse(null);
        System.out.println(key);
//                .ifPresent(System.out::println);


    }
}
