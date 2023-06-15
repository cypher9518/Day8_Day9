package com.basicjava;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter day : ");
        int d = ab.nextInt();
        System.out.print("Enter Month : ");
        int m = ab.nextInt();

        boolean result = (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) ||(m == 6 && d >= 1 && d <= 20);
        if (result)
            System.out.println("Spring Season");
        else
            System.out.println("Not Spring Season");
    }
}
//   Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if
//   day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.