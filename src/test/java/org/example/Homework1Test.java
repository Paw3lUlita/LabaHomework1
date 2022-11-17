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
    void selectionSort() {
    }

    @Test
    void insertionSort() {
    }
}