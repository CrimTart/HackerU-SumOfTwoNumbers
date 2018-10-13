package com.company;

public class Sum {
    //A function calculating the sum of two integers.
    public static long sum(int first, int second) {
        return (long)first + (long)second;
    }

    //Some simple tests for the sum function.
    public static void main(String[] args) {
        System.out.println("5 + 10 = " + sum(5, 10));
        System.out.println("2147483647 + 28 = " + sum(2147483647, 28));
        System.out.println("-2147483648 - 31 = " + sum(-2147483648, -31));
        System.out.println("-2147483648 + 2147483647 = " + sum(-2147483648, 2147483647));
    }
}