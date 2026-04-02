package com.ugv;

import java.util.Arrays;

public class AddElemInArr {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9, 6, 9, 7};
        int newElem = 11;
        int position = 4;

        int[] newArr = new int[arr.length + 1];
        newArr[0] = newElem;

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Adding elem at the beginning : " + Arrays.toString(newArr));

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = newElem;

        System.out.println("Element added at the end : " + Arrays.toString(newArr));

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = newElem;

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Element added to the specific position : " + Arrays.toString(newArr));
    }
}
