package com.ugv;

public class LargeNumInArr {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,44,11,3,6};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
