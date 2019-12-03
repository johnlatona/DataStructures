package com.latona;

public class WeightedQuickUnionDS {
    private int[] parent;
    private int[] size;
    public WeightedQuickUnionDS(int N) {
        parent = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
            size[i] = i;
        }
    }

    private int findRoot(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void connect(int p, int q) {
        int i = findRoot(p);
        int j = findRoot(q);
        if (i == j) return;
        if (size[i] < size[j]) {
            parent[i] = j;
            size[j] += size[i];
        } else {
            parent[j] = i;
            size[i] += size[j];
        }
        parent[i] = j;
    }

    public static void main(String[] args) {
        WeightedQuickUnionDS ex = new WeightedQuickUnionDS(10);
        ex.connect(0, 1);
        ex.connect(1, 5);
        System.out.println(ex.isConnected(0, 1));
        System.out.println(ex.isConnected(0, 3));
        System.out.println(ex.isConnected(0, 5));
        System.out.println(ex.isConnected(5, 0));
    }
}
