package com.ugv;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result = 0;

        int n = String.valueOf(num).length();

        while (num > 0){
            int lastDigit = num % 10;
            result += (int) Math.pow(lastDigit,n);
            num = num/10;
        }

        if (original == result){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
