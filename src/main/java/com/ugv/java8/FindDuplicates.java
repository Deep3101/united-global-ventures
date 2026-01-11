package com.ugv.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "a", "a", "b", "c", "c", "d", "e", "e");

        Set<String> duplicates = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
        System.out.print(duplicates);
    }
}
