package com.basicjava;

public class ArithmeticOpe {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;
        int c = 20;
        double w , x , y , z;
        w = a+b*c;
        x = c+a/b;
        y = a%b+c;
        z = a*b+c;

        System.out.println("a+b*c : " + w);
        System.out.println("c+a/b : " + x);
        System.out.println("a%b+c : " + y);
        System.out.println("a*b+c : " + z);

        System.out.println("Max No is : " + Math.max(Math.max(Math.max(w,x),y),z));
        System.out.println("Min No is : " + Math.min(Math.min(Math.min(w,x),y),z));
    }
}
