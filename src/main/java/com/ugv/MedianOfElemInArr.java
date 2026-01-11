package com.ugv;

public class MedianOfElemInArr {
    public static void main(String[] args) {
        int[] arr = {27,1,2,8,9,0,5,0,3,0,4,23};
        int n = arr.length;
        double median = 0;

        if (n % 2 != 0){
            median = arr[n/2];
        } else {
            median = (arr[n/2] + arr[n/2 - 1])/2.0;
        }

        System.out.println(median);
    }
}
