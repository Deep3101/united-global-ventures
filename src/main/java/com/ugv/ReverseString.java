package com.ugv;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefghijklmonp";
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(chars) + " ");
    }
}
