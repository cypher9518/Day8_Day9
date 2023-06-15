package com.basicjava;

import java.util.Scanner;

public class Distance {

    static void calculate(int x, int y) {
        System.out.println("Distance is " + Math.pow((x * x + y * y), 0.5));
    }
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x = ab.nextInt();
        System.out.print("Enter Y : ");
        int y = ab.nextInt();
        calculate(x, y);

    }
}
