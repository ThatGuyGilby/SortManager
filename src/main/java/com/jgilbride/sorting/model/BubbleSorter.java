package com.jgilbride.sorting.model;

import com.jgilbride.sorting.controller.SortManager;

import static com.jgilbride.sorting.controller.SortManager.logger;

public class BubbleSorter extends SuperSorter
{
    @Override
    public int[] sort(int[] array)
    {
        if (array == null)
        {
            throw new NullPointerException();
        }

        long startTime = System.nanoTime();

        boolean sorted = false;
        int temp;
        while (!sorted)
        {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i+1])
                {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        
        SortManager.logExecutionTime(startTime);

        return array;
    }
}
