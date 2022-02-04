package com.jgilbride.sorting;

import com.jgilbride.sorting.model.SorterType;
import com.jgilbride.sorting.view.SorterWindow;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SorterWindowTests
{
    @Test
    @DisplayName("Given an array of ints, the program should use the bubble sorting method and output a sorted array")
    public void SortManagerBubbleSorterTest()
    {
        SorterWindow sorterWindow = SorterWindow.getWindow();
        sorterWindow.setSorterType(SorterType.BUBBLE);
        sorterWindow.setInputFieldText("[1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8]");
        sorterWindow.sort();

        Assert.assertEquals(sorterWindow.getOutputFieldText(), "[1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9]");
    }

    @Test
    @DisplayName("Given an array of ints, the program should use the merge sorting method and output a sorted array")
    public void SortManagerMergeSorterTest()
    {
        SorterWindow sorterWindow = SorterWindow.getWindow();
        sorterWindow.setSorterType(SorterType.MERGE);
        sorterWindow.setInputFieldText("[1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8]");
        sorterWindow.sort();

        Assert.assertEquals(sorterWindow.getOutputFieldText(), "[1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9]");
    }

    @Test
    @DisplayName("Given an array of ints, the program should use the inbuilt sorting method and output a sorted array")
    public void SortManagerInbuiltSorterTest()
    {
        SorterWindow sorterWindow = SorterWindow.getWindow();
        sorterWindow.setSorterType(SorterType.INBUILT);
        sorterWindow.setInputFieldText("[1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8]");
        sorterWindow.sort();

        Assert.assertEquals(sorterWindow.getOutputFieldText(), "[1, 1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9]");
    }

    @Test
    @DisplayName("Given an array of ints, the program should use the binary tree sorting method and output a sorted array")
    public void SortManagerBinaryTreeSorterTest()
    {
        SorterWindow sorterWindow = SorterWindow.getWindow();
        sorterWindow.setSorterType(SorterType.BINARY_TREE);
        sorterWindow.setInputFieldText("[1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8]");
        sorterWindow.sort();

        Assert.assertEquals(sorterWindow.getOutputFieldText(), "[1, 2, 3, 5, 7, 8, 9]");
    }
}
