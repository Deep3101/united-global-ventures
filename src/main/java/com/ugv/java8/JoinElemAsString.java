package com.ugv.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinElemAsString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java","Python");

        String res = String.join(" ", words);

        System.out.println(res);
    }
}
