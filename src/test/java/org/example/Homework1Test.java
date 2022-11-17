package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Homework1Test {

    @Test
    void bubleSortTest() {
        //given
        int[] testArr = {1, 4, 3, 1, 78, 5};
        int[] expected =  {1, 1, 3, 4, 5, 78};

        //when
        int[] result = Homework1.bubleSort(testArr);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    void selectionSortTest() {
        //given
        int[] testArr = {1, 4, 3, 7, 78, 5};
        int[] expected =  {1, 3, 4, 5, 7, 78};

        //when
        int[] result = Homework1.selectionSort(testArr);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    void insertionSortTest() {
        //given
        int[] testArr = {99, 87, 56, 12, 234, 6};
        int[] expected =  {6, 12, 56, 87, 99, 234};

        //when
        int[] result = Homework1.insertionSort(testArr);

        //then
        assertArrayEquals(expected, result);
    }
}