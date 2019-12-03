package com.latona;

// Simple implementation of Singly Linked List in Java

public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        head = h;
        tail = t;
    }
    /** returns the size of the intList */
    public int size() {
        if (this.tail == null)
            return 1;
        int personInFrontOfMeSize = this.tail.size();
        return personInFrontOfMeSize + 1;
    }

    // iterative methods are often uglier on recursive data structures
    public int iterativeSize() {
        IntList p = this;
        int size = 0;
        while (p != null) {
            size = size + 1;
            p = p.tail;
        }
        return size;
    }

    public IntList iterativeGet(int i) {
        if(i == 0)
            return this;
        int currIndex = 0;
        IntList pointer = this;
        while (currIndex != i) {
            if (pointer != null) {
                pointer = pointer.tail;
                currIndex = currIndex + 1;
            }
        }
        return pointer;
    }

    public int get(int i) {
        if (i == 0) {
            return this.head;
        }
        return this.tail.get(i - 1);
    }

    public String toString() {
        if (tail == null) {
            return Integer.toString(head);
        }
        return Integer.toString(head) + " " + tail.toString();
    }

    public static void main(String[] args) {
        IntList L = new IntList(10, null);
        L.tail = new IntList(15, null);
        System.out.println(L.head);
        System.out.println(L.tail.head);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.iterativeGet(1));
        System.out.println(L.get(1));
    }
}
