package org.example;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {

        int[] testArray = {2, 6, 9, 3, 1, 0};

        System.out.println(Arrays.toString(bubleSort(testArray)));

    }

    public static int[] bubleSort(int[] arr){

            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            return arr;
    }
}