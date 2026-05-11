package com.ugv.twodarray;

public class DiagnolSum2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
        int diagSum = 0;

        for (int i = 0; i < arr.length; i++) {
            diagSum += arr[i][i];
        }

        System.out.println(diagSum);
    }
}
