package com.jgilbride.sorting;

import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jgilbride.sorting.SortManager.logger;

public class SortManagerTests
{
    @Test
    @DisplayName("Given an array of ints, BubbleSorter is expected to sort the given array and return it")
    public void SortManagerBubbleSorterTest()
    {
        SortManager sortManager = new SortManager();
        Sorter bubbleSorter = sortManager.GetSorter(SorterType.BUBBLE);
        int[] actual = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        final long startTime = System.nanoTime();
        actual = bubbleSorter.sort(actual);
        final long endTime = System.nanoTime();
        logger.info("Total execution time: " + (endTime - startTime));

        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9};

        Assert.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Given an array of ints, MergeSorter is expected to sort the given array and return it")
    public void SortManagerMergeSorterTest()
    {
        SortManager sortManager = new SortManager();
        Sorter mergeSorter = sortManager.GetSorter(SorterType.MERGE);
        int[] actual = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        final long startTime = System.nanoTime();
        actual = mergeSorter.sort(actual);
        final long endTime = System.nanoTime();
        logger.info("Total execution time: " + (endTime - startTime));

        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9};

        Assert.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Given an array of ints, BinaryTreeSorter is expected to sort the given array and return it")
    public void SortManagerBinaryTreeSorterTest()
    {
        SortManager sortManager = new SortManager();
        Sorter mergeSorter = sortManager.GetSorter(SorterType.BINARY_TREE);
        int[] actual = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        final long startTime = System.nanoTime();
        actual = mergeSorter.sort(actual);
        final long endTime = System.nanoTime();
        logger.info("Total execution time: " + (endTime - startTime));

        int[] expected = new int[]{1, 2, 3, 5, 7, 8, 9};

        Assert.assertEquals(actual, expected);
    }
}
