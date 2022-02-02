package com.jgilbride.sorting;

import java.util.ArrayList;

public class BinaryTreeSorter implements Sorter
{
    @Override
    public int[] sort(int[] array)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BinaryTree binaryTree = new BinaryTree(array[0]);

        binaryTree.feed(array);
        binaryTree.order(binaryTree.node, list);

        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            array[i] = (int) list.toArray()[i];
        }

        return array;
    }

}
