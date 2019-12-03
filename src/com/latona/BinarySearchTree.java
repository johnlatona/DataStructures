package com.latona;

public class BinarySearchTree {
    private int value;
    private BinarySearchTree left;
    private BinarySearchTree right;

    public BinarySearchTree(int value) {
        this.value = value;
    }

    public BinarySearchTree(int value, BinarySearchTree left, BinarySearchTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {

        return this.value;
    }

    public static BinarySearchTree find(BinarySearchTree T, Key sk) {
        if (T == null) {
            return null;
        }
        if (sk.keyequals(T.getValue())) {
            return T;
        }
        else if (sk.value < T.getValue()) {
            return find(T.left, sk);
        }
        else return find(T.right, sk);
    }

    public static BinarySearchTree insert(BinarySearchTree T, Key ik) {
        if (T == null) {
            return new BinarySearchTree(ik.getValue());
        }
        if (ik.getValue() < T.getValue()) {
            T.left = insert(T.left, ik);
        } else if (ik.getValue() > T.getValue()) {
            T.right = insert(T.right, ik);
        }
        return T;
    }

    public static void main(String[] args) {

    }

    private class Key {
        private int value;
        private Key left;
        private Key right;
        private Key(int value) {
            this.value = value;
        }
        private Key(int value, Key left, Key right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        private boolean keyequals(int value) {
            return value == this.value;
        }
        private int getValue() {
            return this.value;
        }
    }
}
