package com.jgilbride.sorting.model;

import com.jgilbride.sorting.controller.SortManager;

public class MergeSorter implements Sorter
{
    @Override
    public int[] sort(int[] array)
    {
        long startTime = System.nanoTime();
        int[] sortedArray = sort(array, array.length);
        SortManager.logExecutionTime(startTime);

        return sortedArray;
    }

    public int[] sort(int[] array, int n)
    {
        if (array == null)
        {
            throw new NullPointerException();
        }

        if (n < 2)
        {
            return array;
        }

        int middleIndex = n / 2;
        int[] leftSide = new int[middleIndex];
        int[] rightSide = new int[n - middleIndex];

        System.arraycopy(array, 0, leftSide, 0, middleIndex);

        for (int i = middleIndex; i < n; i++)
        {
            rightSide[i - middleIndex] = array[i];
        }

        sort(leftSide, middleIndex);
        sort(rightSide, n - middleIndex);

        merge(array, leftSide, rightSide, middleIndex, n - middleIndex);

        return array;
    }

    public void merge(int[] array, int[] leftSide, int[] rightSide, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
        {
            if (leftSide[i] <= rightSide[j])
            {
                array[k++] = leftSide[i++];
            }
            else {
                array[k++] = rightSide[j++];
            }
        }
        while (i < left)
        {
            array[k++] = leftSide[i++];
        }
        while (j < right)
        {
            array[k++] = rightSide[j++];
        }
    }
}
