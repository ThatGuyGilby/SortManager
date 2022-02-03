package com.jgilbride.sorting.model;

import com.jgilbride.sorting.controller.SortManager;

import java.util.ArrayList;

import static com.jgilbride.sorting.controller.SortManager.logger;

public class BinaryTreeSorter extends SuperSorter
{
    @Override
    public int[] sort(int[] array)
    {
        if (array == null)
        {
        throw new NullPointerException();
        }

        long startTime = System.nanoTime();

        ArrayList<Integer> list = new ArrayList<Integer>();
        BinaryTree binaryTree = new BinaryTree(array[0]);

        binaryTree.feed(array);
        binaryTree.order(binaryTree.node, list);

        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            array[i] = (int) list.toArray()[i];
        }

        SortManager.logExecutionTime(startTime);

        return array;
    }
}
