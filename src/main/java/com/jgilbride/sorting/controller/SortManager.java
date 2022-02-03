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

    public static void logExecutionTime(long startTime)
    {
        long endTime = System.nanoTime();
        long executionNanoTime = endTime - startTime;
        StringBuilder stringBuilder = new StringBuilder("Execution time: ");
        stringBuilder.append(executionNanoTime);
        stringBuilder.append("ns | ");
        stringBuilder.append(executionNanoTime * 0.000000001);
        stringBuilder.append("s");
        logger.info(stringBuilder.toString());
    }
}
