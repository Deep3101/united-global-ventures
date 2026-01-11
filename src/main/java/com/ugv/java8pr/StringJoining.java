package com.ugv.java8pr;

import java.util.Arrays;
import java.util.List;

public class StringJoining {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4");

        String result = String.join("-", list);
        System.out.println(result);
    }
}
