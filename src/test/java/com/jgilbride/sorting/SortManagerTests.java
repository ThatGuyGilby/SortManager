package com.jgilbride.sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SortManagerTests
{
    @Test
    public void SortManagerBubbleSorterTest()
    {
        SortManager sortManager = new SortManager();
        Sorter bubbleSorter = sortManager.GetSorter(SorterType.BUBBLE);
        int[] actual = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};
        bubbleSorter.sort(actual);

        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9};

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void SortManagerMergeSorterTest()
    {
        SortManager sortManager = new SortManager();
        Sorter mergeSorter = sortManager.GetSorter(SorterType.MERGE);
        int[] actual = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};
        mergeSorter.sort(actual);

        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9};

        Assert.assertEquals(actual, expected);
    }
}
