package com.jgilbride.sorting;

import java.util.Arrays;

public class SortManagerTests
{
    public static void main(String[] args)
    {
        SortManager sortManager = new SortManager();
        Sorter bubbleSorter = new BubbleSorter();
        Sorter mergeSorter = new MergeSorter();
        int[] array = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};
        //sortManager.bubbleSort(array);
        //sortManager.mergeSort(array);
        //bubbleSorter.sort(array);
        mergeSorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
