package com.ugv.java8pr;

import java.util.Arrays;

public class FindLongestStringFromArray {
    public static void main(String[] args) {
        String[] str = {"Microservices", "deep", "nikhil", "nehansh", "java"};

        String s = Arrays.stream(str).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();

        System.out.println(s);

    }
}
