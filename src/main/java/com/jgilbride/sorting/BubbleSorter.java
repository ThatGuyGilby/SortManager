package com.jgilbride.sorting;

public class BubbleSorter implements Sorter
{
    @Override
    public int[] sort(int[] array)
    {
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

        return array;
    }
}
