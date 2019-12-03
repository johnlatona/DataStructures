package com.latona;

import java.util.ArrayList;

public class MinPQImpl implements MinPQ {

    int[] nodes;

    public MinPQImpl(int[] nodes) {
        this.nodes = nodes;
    }

    @Override
    public void add(int x) {
        // copies the array and adds new int into last position
        int[] newNodesArray = new int[this.nodes.length + 1];
        for (int i = 0; i < this.nodes.length; i++) {
            newNodesArray[i] = this.nodes[i];
        }
        newNodesArray[newNodesArray.length - 1] = x;
        this.nodes = newNodesArray;
        int parentIndex = this.nodes.length - 1 / 2;
        int thisIndex = findIndex(this.nodes, x);
        //  "bubbles up" the new element until it's parent is less than itself
        while (this.nodes[parentIndex] > x) {
            int temp = this.nodes[parentIndex];
            this.nodes[parentIndex] = x;
            this.nodes[thisIndex] = temp;
            thisIndex = parentIndex;
            parentIndex = thisIndex / 2;
        }
    }

    private int findIndex(int[] arr, int elem) {
        if (arr == null) return -1;
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == elem) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    @Override
    public int getSmallest() {
        return nodes[1];
    }

    @Override
    public int removeSmallest() {
        // save first root node from nodes array
        int removed = this.nodes[1];
        // replace first root node with last node in array
        this.nodes[1] = this.nodes[this.nodes.length - 1];
        // create new array with a size of 1 less than nodes array and copy array up until the end of the length
        // this deletes the last element in the array
        // reassign this.nodes to new copied array.
        int[] newNodes = new int[this.nodes.length - 1];
        for (int i = 0; i < newNodes.length; i++) {
            newNodes[i] = this.nodes[i];
        }
        this.nodes = newNodes;
        // this is the element we moved up to the root position.
        int toBubbleDown = this.nodes[1];
        // initial left and right child indices
        int leftChildIndex = 2;
        int rightChildIndex = 3;
        // smallest of the two children
        int smallestChild = Math.min(this.nodes[leftChildIndex], this.nodes[rightChildIndex]);
        // "bubbles down" the new root until it is smaller than both of it's children.
        while (toBubbleDown > this.nodes[leftChildIndex] && toBubbleDown > this.nodes[rightChildIndex]) {
            int smallestChildIndex = findIndex(this.nodes, smallestChild);
            int toBubbleIndex = findIndex(this.nodes, toBubbleDown);
            int toSwap = this.nodes[smallestChildIndex];
            this.nodes[smallestChildIndex] = toBubbleDown;
            this.nodes[toBubbleIndex] = toSwap;
            leftChildIndex = smallestChildIndex * 2;
            rightChildIndex = smallestChildIndex * 2 + 1;
            toBubbleDown = this.nodes[smallestChildIndex];
        }
        // returns original removed root node
        return removed;
    }

    @Override
    public int size() {
        return this.nodes.length;
    }
}
