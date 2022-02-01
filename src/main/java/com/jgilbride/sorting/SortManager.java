package com.jgilbride.sorting;

public class SortManager
{
    public Sorter GetSorter(SorterType type)
    {
        switch(type)
        {
            case BUBBLE -> {
                return new BubbleSorter();
            }
            case MERGE -> {
                return new MergeSorter();
            }
        }

        return null;
    }
}
