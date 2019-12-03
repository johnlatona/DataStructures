package com.latona;

public class Sort {
    // Puts A in sorted order -- Selection Sort
    public static void sort(String[] a) {
        // Find the smallest thing
        // Swap it to the front
        // Recursively sort the rest.
        sort(a, 0);
    }

    private static int indexOfSmallest(String[] a, int start) {
        int minDex = start;
        int i = start;
        while (i < a.length) {
            int compareResult = a[i].compareTo(a[minDex]);
            if (compareResult < 0) {
                minDex = i;
            }
            i++;
        }
        return minDex;
    }
    // Sort A starting from position "start"
    private static void sort(String[] a, int start) {
        if (start == a.length) return;
        // Find smallest thing.
        int mindex = indexOfSmallest(a, start);
        // swap it to the front
        swap(a, mindex, start);
        sort(a, start + 1);
    }
    // Swap items in position ix and iy in A.
    private static void swap(String[] a, int ix, int iy) {
        String temp = a[ix];
        a[ix] = a[iy];
        a[iy] = temp;
    }

    //Prints A
    public static void print(String[] a) {

    }

    // Prints ARGS in sorted order.
    public static void main(String[] args) {
        String[] strings = {"this", "cat", "is", "cool"};
        System.out.println(strings.toString());
        sort(strings);
        System.out.println(strings.toString());
    }
}
