package com.ugv.twodarray;

import java.util.Arrays;

public class Transpose2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpose = new int[3][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                transpose[j][i] = arr[i][j];
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
