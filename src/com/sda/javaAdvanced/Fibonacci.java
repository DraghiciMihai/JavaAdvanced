package com.sda.javaAdvanced;

import java.util.Scanner;

public class Fibonacci {
    static int count = 1;
    static int fib = 1;
    static int prev;
    static int nr;

    public static void main(String[] args) {
        System.out.println("Al catelea numar din sirul Fibonacci sa afisez?");
        nr = new Scanner(System.in).nextInt();
        fibonacci(fib);
    }

    public static void fibonacci(int x) {
        if (count == nr)
            System.out.println("Al " + nr + "-lea numar din sirul Fibonacci este " + fib);
        else {
            fib = prev + x;
            prev = x;
            count++;
            fibonacci(fib);
        }
    }
}



