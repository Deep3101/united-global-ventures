package com.ugv.java8;

import java.util.Arrays;
import java.util.List;

public class FlatMapSplitEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java","Python");
        List<String> letters = words.stream().flatMap(s -> Arrays.stream(s.split(""))).toList();
        System.out.println(letters);
    }
}
