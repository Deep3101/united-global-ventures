package com.ugv;

import java.util.Arrays;

public class ArraysInIncrDecr {
    public static void main(String[] args) {
        int[] arr = {4,5,8,1,6,9,6};
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n/2; i++){
            System.out.println(arr[i]);
        }

        for (int i = n - 1; i >= n/2; i--){
            System.out.println(arr[i]);
        }
    }
}
