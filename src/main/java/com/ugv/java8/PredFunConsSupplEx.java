package com.ugv.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredFunConsSupplEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C");
        Predicate<String> predicate = s -> s.length() > 3;
        list.stream().filter(predicate).forEach(System.out::println);

        Function<String, Integer> func = String::length;
        System.out.println(func.apply("Deep")); // 4

        Supplier<String> supplier = () -> "Generated";
        System.out.println(supplier.get());

        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

    }
}
