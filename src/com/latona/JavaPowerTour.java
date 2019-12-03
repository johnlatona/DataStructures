package com.latona;

import java.io.IOException;

public class JavaPowerTour {
    public static void powerTour(int x) throws IOException {
        int acc = x;
        while (true) {
            System.out.println(acc);
            System.in.read();
            acc = acc * x;
        }
    }
    public static void main(String[] args) throws IOException {
        powerTour(5);
    }
}
