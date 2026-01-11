package com.ugv.twodarray;

public class column2DArraySum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++){
            int colSum = 0;
            for (int i = 0; i < row; i++){
                colSum += arr[i][j];
            }
            System.out.println("Column " + j + " sum = " + colSum);
        }
    }
}
