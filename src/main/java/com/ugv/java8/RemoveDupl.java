package com.ugv.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupl {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "a", "a", "b", "c", "c", "d", "e", "e");
//        list.stream().distinct().forEach(System.out::print);
        list.stream().distinct().forEach(s -> System.out.print(s + " "));

        String result = list.stream()
                .distinct()
                .collect(Collectors.joining(" "));

        System.out.print(result);

    }
}
