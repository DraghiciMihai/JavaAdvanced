package com.sda.javaAdvanced;

import java.util.LinkedList;

public class Insumare {
    static LinkedList<Integer> lista = new LinkedList<>();
    static int sum = 0;

    public static void main(String[] args) {
        lista.add(2);
        lista.add(7);
        lista.add(9);
        lista.add(2);
        lista.add(8);
        lista.add(5);
        lista.add(1);
        lista.add(6);
        System.out.println(lista);
        suma(lista);
    }

    static void suma(LinkedList x) {
        if (x.peek() != null) {
            sum += lista.peek();
            lista.remove();
            suma(lista);
        } else
            System.out.println("Suma listei este " + sum);

    }
}
