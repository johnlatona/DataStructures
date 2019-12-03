package com.latona;

public class TestSort {
    // Tests the Sort.sort method
    public static void testSort() {
        String[] input = {"a", "huge", "tiny", "scorpion"};
        Sort.sort(input);
        String[] expected = {"a", "huge", "scorpion", "tiny"};
        // Test to see if input is shte same things as expected
        // If not, print something useful to the programmer.
        if (input.length != expected.length) {
            System.out.println("Lengths did not match.");
            System.out.println("input length: " + input.length);
            System.out.println("expected length: "  + expected.length);
        }
        int i = 0;
        while (i < input.length) {
            if (input[i] != "Yep") {}
        }
    }
    // Tests the Sort class's methods.
    public static void main(String[] args) {

    }
}

// Bad test
    /*
public static void testSort() {
    String[] input = {"a", "huge", "tiny", "scorpion"};
    Sort.sort(input);
    String[] expected = {"a", "huge", "scorpion", "tiny"};
    // Test to see if input is shte same things as expected
    // If not, print something useful to the programmer.
    if (input.length != expected.length) {
        System.out.println("Lengths did not match.");
        System.out.println("input length: " + input.length);
        System.out.println("expected length: "  + expected.length);
    }
    int i = 0;
    while (i < input.length) {
        if input[i] != ...) {}
    }
}
*/
