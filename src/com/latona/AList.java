package com.latona;

public class AList {
    // Invariants:
    // The next item to be inserted goes into position size.
    // The last item in the list is in position size - 1.
    // There are size items in the list.
    // The ith item is in the position i.

    private int[] items;
    private int size;
    private int capacity;

    public AList() {
        items = new int[100];
        size = 0;
        capacity = 100;
    }

    private void resize(int c) {
        int[] newItems = new int[c];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
        capacity = c;
    }

    public void insertBack(int x) {
        if (size == capacity) {
            resize(size * 2);
        }
        items[size] = x;
        size += 1;
    }

    public int getBack() {
        return items[size - 1];
    }

    public int get(int i) {
        return items[i];
    }

    public int deleteBack() {
        size = size - 1;
        return items[size];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        AList L = new AList();
        System.out.println(L.size());

        L.insertBack(99);
        L.insertBack(99);
        System.out.println(L.size());

        AList L2 = new AList();
        L2.insertBack(99);
        L2.insertBack(30);
        System.out.println(L2.size());
        System.out.println(L2.get(1));
        System.out.println(L2.getBack());

        AList L3 = new AList();
        L3.insertBack(99);
        L3.insertBack(15);
        L3.deleteBack();
        System.out.println(L3.getBack());
    }
}
