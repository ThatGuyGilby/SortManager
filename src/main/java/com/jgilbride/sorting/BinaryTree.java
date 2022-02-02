package com.jgilbride.sorting;

import java.util.ArrayList;

import static com.jgilbride.sorting.SortManager.logger;

public class BinaryTree
{
    Node node;

    BinaryTree(int value)
    {
        node = new Node(value);
    }

    public Node add(Node node, int value){
        if(node == null)
        {
            return new Node(value);
        }

        if(value < node.value)
        {
            node.left = add(node.left, value);
        }

        else if(value > node.value)
        {
            node.right = add(node.right, value);
        }

        //logger.info("Node already existed so it has been returned.");
        return node;
    }

    public void order(Node node, ArrayList<Integer> list){
        if(node != null)
        {
            order(node.left, list);
            list.add(node.value);
            order(node.right, list);
        }
    }

    public void feed(int[] array)
    {
        for (int j : array) {
            add(node, j);
        }
    }

    public class Node
    {
        int value;
        Node left;
        Node right;

        Node(int value)
        {
            this.value = value;
            left = null;
            right = null;
        }
    }

}
