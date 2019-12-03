package com.latona;

// Simple singly-linked list implementation
// singly linked lists are slow when implementing delete and reordering operations, Doubly Linked lists make this faster

public class SLists {
    private IntNode head;
    private int size;

    public SLists(IntNode head, int size) {
        this.head = head;
        this.size = size;
    }
    private class IntNode {
        private int val;
        private IntNode next;

        private IntNode(int val, IntNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public void insertBack(int v) {
        IntNode p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(v, null);
    }

    public void insertFront(int v) {
        head.next = new IntNode(v, head);
        size = size + 1;
    }
}
