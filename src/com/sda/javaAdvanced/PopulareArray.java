package com.sda.javaAdvanced;

import java.util.Scanner;

public class PopulareArray {
    static int[] array = new int[10];
    static int i;

    public static void main(String[] args) {
        adauga(array);
        for(int n:array)
            System.out.print(n+" ");
    }

    static void adauga(int[] x) {
        if (i == 10)
            System.out.println("Arrayul a fost populat");

        else {
            System.out.println("Introduceti elementul de pe pozitia " + i);
            array[i] = new Scanner(System.in).nextInt();
            i++;
            adauga(array);
        }
    }
}
