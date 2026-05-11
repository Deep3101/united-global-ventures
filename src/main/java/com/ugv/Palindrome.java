package com.ugv;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int reverse = 0;

        while(num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        if (originalNum == reverse){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
