package com.ugv.java8;

import java.util.Arrays;
import java.util.List;

public class PrintElemsInUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Python","c");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
