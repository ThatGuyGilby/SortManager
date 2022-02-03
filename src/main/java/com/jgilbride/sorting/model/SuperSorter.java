package com.jgilbride.sorting.model;

import java.util.Arrays;

public class SuperSorter implements Sorter, Comparable<SuperSorter>
{

    @Override
    public int[] sort(int[] array)
    {
        Arrays.sort(array);
        return array;
    }

    @Override
    public int compareTo(SuperSorter o)
    {
        long myStartTime = System.nanoTime();
        sort(new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8});
        long myTimeTaken = System.nanoTime() - myStartTime;

        long oStartTime = System.nanoTime();
        o.sort(new int[]{1, 9, 8, 2, 3, 1, 1, 5, 9, 3, 7, 7, 2, 8});
        long oTimeTaken = System.nanoTime() - myStartTime;

        if (myTimeTaken == oTimeTaken)
        {
            return 0;
        }
        else if (myTimeTaken < oTimeTaken)
        {
            return 1;
        }

        return -1;
    }
}
