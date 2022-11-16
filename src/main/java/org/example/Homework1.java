package org.example;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {

        int[] testArray1 = {2, 6, 9, 3, 1, 0};
        int[] testArray2 = {25, 65, 94, 33, 1, 0};
        int[] testArray3 = {5, 75, 99, 2, 1, 0};


        System.out.println(Arrays.toString(bubleSort(testArray1)));
        System.out.println(Arrays.toString(selectionSort(testArray2)));
        System.out.println(Arrays.toString(insertionSort(testArray3)));

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

    public static int[] selectionSort(int[] arr)
    {
        int minPosition;

        for (int i = 0; i < arr.length; i++)
        {
            minPosition = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[minPosition])
                {
                    minPosition = j;
                }
            }

            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static int[] insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }
}