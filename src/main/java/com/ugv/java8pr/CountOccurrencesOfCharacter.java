package com.ugv.java8pr;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrencesOfCharacter {
    public static void main(String[] args) {
        String str = "MyNameisDeepPanchal";

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;

        System.out.println(collect);

    }
}
