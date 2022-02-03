package com.jgilbride.sorting.model;

import com.jgilbride.sorting.controller.SortManager;

import java.util.Arrays;

public class InbuiltSorter implements Sorter
{
    @Override
    public int[] sort(int[] array)
    {
        if (array == null)
        {
            throw new NullPointerException();
        }

        long startTime = System.nanoTime();
        Arrays.sort(array);
        SortManager.logExecutionTime(startTime);
        return array;
    }
}
