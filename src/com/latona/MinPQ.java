package com.latona;

// Priority Queue: Allowing tracking and removal of the smallest item in a priority queue
public interface MinPQ {
    // adds the item to the priority queue
    public void add(int x);

    // returns the smallest item (lowest priority) in the priority queue
    public int getSmallest();

    // Removes the smallest item (lowest priority) from the priority queue
    public int removeSmallest();

    // returns the size of the priority queue
    public int size();
}
