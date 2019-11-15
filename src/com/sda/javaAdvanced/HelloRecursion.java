package com.sda.javaAdvanced;

public class HelloRecursion {
    static int i;

    public static void main(String[] args) {
        hello();
    }

    static void hello() {
        if (i != 10){
            System.out.println(i+1 + " Hello Recursion");
            i++;
            hello();}

    }
}
