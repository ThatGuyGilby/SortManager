package com.jgilbride.sorting.model;

public enum SorterType
{
    BUBBLE("Bubble"),
    MERGE("Merge"),
    BINARY_TREE("Binary Tree"),
    INBUILT("Arrays.sort");

    public final String name;

    SorterType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
