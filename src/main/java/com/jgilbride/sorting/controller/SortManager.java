package com.jgilbride.sorting.controller;

import com.jgilbride.sorting.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortManager
{
    public static Logger logger = LogManager.getLogger("Sort Manager Logger");

    public SuperSorter getSorter(SorterType type)
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
            case INBUILT -> {
                return new InbuiltSorter();
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
