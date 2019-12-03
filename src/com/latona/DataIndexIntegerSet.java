package com.latona;

public class DataIndexIntegerSet {
    // great lookup speed, wasteful on space.
    boolean[] present;

    public DataIndexIntegerSet() {
        present = new boolean[1000000];
    }

    public void put(int i) {
        present[i] = true;
    }

    public boolean contains(int i) {
        return present[i];
    }

    public boolean contains(String s) {
        int intRep = convertToInt(s);
        return true;
    }

    public static int convertToInt(String s) {
        int intRep = 0;
        for (int i = 0; i < s.length(); i++) {
            intRep = intRep << 5;
            intRep = intRep + letterNum(s, i);
        }
        return intRep;
    }

    public static int letterNum(String s, int i) {
        int ithChar = s.charAt(i);
        if ((ithChar < 'a') || (ithChar > 'z')) {
            throw new IllegalArgumentException();
        }
        return ithChar - 'a' + 1;
    }

    public static void main(String[] args) {
        System.out.println(-1 % 4);
    }
}

// convert standard array to a data index array
// int[] ints = [0, 2, 3, 4, 5, 6]
// for (int i = 0; i < ints.length; i++) {
//     put(ints[i]);
// }
//
// return contains(2) --> true
// return contains(11) --> false

