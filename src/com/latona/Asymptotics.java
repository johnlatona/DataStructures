package com.latona;

public class Asymptotics {

    // Order of growth = can be bound by O(2N), or just simply O(n) -- not O(n^2) because i doubles and j only goes up to i.
    // Key 1: Sum a bunch of numbers up to N it's Theta(n^2) -- 1 + 2 + 3 + 4 + ... + N = N(N+1)/2 = Theta(n^2).
    // Key 2: Sum a bunch of powers of 2 up to N its Theta(n) -- 1 + 2 + 4 + 8 + ... + N = 2N - 1 = Theta(n)
    public static void printIndices2(int n) {
        for (int i = 1; i <= n; i = i * 2) {
            for (int j = 0; j < i; j += 1) {
                System.out.println("hello");
                int A = 1 + 1;
            }
        }
    }
    // Order of growth -- O(2^n-1) or O(2^n) -- because each time n increases by 1, your call tree doubles.
    // Recursion and Recurrence relations -- number of calls = C(N). C(1) = 1. C(N) = 1 + 2C(N-1)
    public static int f3 (int n) {
        if(n <= 1) {
            return 1;
        }
        return f3(n-1)+ f3(n-1);
    }
    // recursive binary search. Order of growth is log(n) -- cutting things in half over and over. Hallmark of log. N = 2^k - 1 for some k.
    // So C(N) = k. N = 2^C(N) - 1.
    // So if N = 2^k - 1, k = lgN (lg is short for log base 2). The ceiling of lgN is Theta(logN). Ceiling is just rounding up -- 3.8 becomes 4. Does not change rate of growth.
    public static int binarySearch(String[] sorted, String x, int lo, int hi) {
        if (lo > hi) return - 1;
        int m = (lo + hi) / 2; // this line is problematic -- for very large arrays with large numerical values -- will overflow. maybe shouldn't be int?
        int cmp = x.compareTo(sorted[m]);
        if (cmp < 0) return binarySearch(sorted, x, lo, m - 1);
        else if (cmp > 0) return binarySearch(sorted, x, m + 1, hi);
        else return m;
    }

    public static void main(String[] args) {
        printIndices2(10);
    }
}
