package com.ugv.java8;

public class RunnableUsingLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Thread is running");
        new Thread(runnable).start();
    }
}
