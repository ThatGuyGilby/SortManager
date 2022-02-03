package com.jgilbride.sorting.controller;

import com.jgilbride.sorting.model.*;

import java.util.logging.Logger;

public class SortManager
{
    public static Logger logger = Logger.getLogger("Sort Manager Logger");

    public Sorter getSorter(SorterType type)
    {
        switch(type)
        {
            case BUBBLE -> {
                return new BubbleSorter();
            }
            case MERGE -> {
                return new MergeSorter();
            }
            case BINARY_TREE -> {
                return new BinaryTreeSorter();
            }
        }

        return null;
    }
}
