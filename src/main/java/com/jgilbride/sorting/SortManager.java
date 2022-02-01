package com.jgilbride.sorting;

public class SortManager
{
    public int[] bubbleSort(int[] array)
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

    public void mergeSort(int[] array)
    {
        mergeSort(array, array.length);
    }

    public void mergeSort(int[] array, int n)
    {
        if (n < 2)
        {
            return;
        }

        int middleIndex = n / 2;
        int[] leftSide = new int[middleIndex];
        int[] rightSide = new int[n - middleIndex];

        for (int i = 0; i < middleIndex; i++)
        {
            leftSide[i] = array[i];
        }

        for (int i = middleIndex; i < n; i++)
        {
            rightSide[i - middleIndex] = array[i];
        }

        mergeSort(leftSide, middleIndex);
        mergeSort(rightSide, n - middleIndex);

        merge(array, leftSide, rightSide, middleIndex, n - middleIndex);
    }

    public void merge(int[] array, int[] leftSide, int[] rightSide, int left, int right) {

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
