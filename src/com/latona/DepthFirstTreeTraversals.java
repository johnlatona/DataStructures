package com.latona;

public class DepthFirstTreeTraversals {
    private class BSTNode<Key> {
        Key key;
        BSTNode left;
        BSTNode right;

        public BSTNode(Key key, BSTNode left, BSTNode right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }

    public void preOrder(BSTNode x) {
        if (x == null) return;
        System.out.println(x.key);
        preOrder(x.left);
        preOrder(x.right);
    }

    public void inOrder(BSTNode x) {
        if (x == null) return;
        inOrder(x.left);
        System.out.println(x.key);
        inOrder(x.right);
    }

    public void postOrder(BSTNode x) {
        if (x == null) return;
        postOrder(x.left);
        postOrder(x.right);
        System.out.println(x.key);
    }

}
