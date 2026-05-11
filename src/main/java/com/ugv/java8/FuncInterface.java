package com.ugv.java8;

@FunctionalInterface
public interface FuncInterface {

    int add(int a, int b);

    default String doPayment(String source, String dest) {
        return null;
    }

//    Thread thread = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("RUnning...");
//        }
//    }); // too verbose
}
