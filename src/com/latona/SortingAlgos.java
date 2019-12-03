package com.latona;

public class SortingAlgos {

    int[] arr;

    public SortingAlgos(int[] arr) {
        this.arr = arr;
    }

    public void selectionSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int min= findMinimum(arr, i);
            int toSwapIndex = findIndex(arr, min);
            int temp = arr[i];
            arr[i] = arr[toSwapIndex];
            arr[toSwapIndex] = temp;
            i = i + 1;
        }
        this.arr = arr;
    }

    private int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private int findMinimum(int[] arr, int startingIndex) {
        int i = startingIndex;
        int min = arr[i];
        while (i < arr.length - 1) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i = i + 1;
        }
        return min;
    }

    public String toString(int[] arr) {
        String string = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                string += arr[i] + ", ";
            } else {
                string += arr[i];
            }
        }
        string += "]";
        return string;
    }

    public static void main(String[] args) {
        SortingAlgos sortingAlgos = new SortingAlgos(new int[] {4,6,3,7,5,2,8,1,9});
        int[] unsorted = sortingAlgos.arr;
        System.out.println(sortingAlgos.toString(sortingAlgos.arr));
        sortingAlgos.selectionSort(sortingAlgos.arr);
        System.out.println(sortingAlgos.toString(sortingAlgos.arr));
    }
}
