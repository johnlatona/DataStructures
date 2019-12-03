package com.latona;

public class Sum {
    public static int whilesum(int[] x) {
        int sum = 0;
        int index = 0;
        while (index < x.length) {
            sum += x[index];
            index++;
        }
        return sum;
    }

    public static int forsum(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

    public static int otherForSum(int[] x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }

    public static int weirdForLoop(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; sum += x[i], i++);
        return sum;
    }

    public static int altSum2(int[] x) {
        return altSum2(x, 0);
    }

    public static int altSum2(int[]x, int i) {
        if (i >= x.length) return 0;
        return x[i] + altSum2(x, i + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(whilesum(nums));

        int[] forsums = {1, 2, 3, 4};
        System.out.println(forsum(forsums));
    }
}
