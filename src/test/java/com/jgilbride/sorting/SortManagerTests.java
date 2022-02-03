package com.jgilbride.sorting;

import com.jgilbride.sorting.controller.SortManager;
import com.jgilbride.sorting.model.Sorter;
import com.jgilbride.sorting.model.SorterType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jgilbride.sorting.controller.SortManager.logger;

public class SortManagerTests
{
    @Test
    @DisplayName("Given an array of ints, BubbleSorter is expected to sort the given array and return it")
    public void SortManagerBubbleSorterTest()
    {
        SortManager sortManager = new SortManager();
        Sorter sorter = sortManager.getSorter(SorterType.BUBBLE);
        int[] array = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        int[] actual = sorter.sort(array);
        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9};

        Assert.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Given an array of ints, MergeSorter is expected to sort the given array and return it")
    public void SortManagerMergeSorterTest()
    {
        SortManager sortManager = new SortManager();
        Sorter sorter = sortManager.getSorter(SorterType.MERGE);
        int[] array = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        int[] actual = sorter.sort(array);
        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9};

        Assert.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Given an array of ints, BinaryTreeSorter is expected to sort the given array and return it")
    public void SortManagerBinaryTreeSorterTest()
    {
        SortManager sortManager = new SortManager();
        Sorter sorter = sortManager.getSorter(SorterType.BINARY_TREE);
        int[] array = new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8};

        int[] actual = sorter.sort(array);
        int[] expected = new int[]{1, 2, 3, 5, 7, 8, 9};

        Assert.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Given a null array, BubbleSorter is expected to throw a NullPointerException")
    public void SortManagerBubbleSorterNullTest()
    {
        SortManager sortManager = new SortManager();
        Sorter sorter = sortManager.getSorter(SorterType.BUBBLE);

        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            sorter.sort(null);
        });
    }

    @Test
    @DisplayName("Given a null array, MergeSorter is expected to throw a NullPointerException")
    public void SortManagerMergeSorterNullTest()
    {
        SortManager sortManager = new SortManager();
        Sorter sorter = sortManager.getSorter(SorterType.MERGE);

        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            sorter.sort(null);
        });
    }

    @Test
    @DisplayName("Given a null array, BinaryTreeSorter is expected to throw a NullPointerException")
    public void SortManagerBinaryTreeSorterNullTest()
    {
        SortManager sortManager = new SortManager();
        Sorter sorter = sortManager.getSorter(SorterType.BINARY_TREE);

        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            sorter.sort(null);
        });
    }
}
