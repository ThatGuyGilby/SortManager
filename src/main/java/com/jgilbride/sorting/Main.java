package com.jgilbride.sorting;

import java.util.Arrays;

import static com.jgilbride.sorting.SortManager.logger;

public class Main
{
    public static void main(String[] args)
    {
        SortManager sortManager = new SortManager();
        int[] actual = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        Sorter sorter = sortManager.GetSorter(SorterType.BUBBLE);
        logger.info("Bubble Sort Output: " + Arrays.toString(sorter.sort(actual)));

        sorter = sortManager.GetSorter(SorterType.MERGE);
        logger.info("Merge Sort Output: " + Arrays.toString(sorter.sort(actual)));

        sorter = sortManager.GetSorter(SorterType.BINARY_TREE);
        logger.info("Binary Tree Sort Output: " + Arrays.toString(sorter.sort(actual)));
    }
}
