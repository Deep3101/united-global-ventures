package com.ugv;

public class secSmallestAndSecLargestInArr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 44, 11, 3, 6};

        int secSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secSmallest = smallest;
                smallest = num;
            } else if (num < secSmallest && num != smallest) {
                secSmallest = num;
            }
        }
        System.out.println(secSmallest + " " + smallest);

    }
}
