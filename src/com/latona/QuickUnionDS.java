package com.latona;

public class QuickUnionDS {
    private int[] parent;
    public QuickUnionDS(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
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
        parent[i] = j;
    }
}
