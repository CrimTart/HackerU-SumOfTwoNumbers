package com.company;

public class Sum {
    //A function calculating the sum of two integers. Overflow is discarded.
    public static int sum(int first, int second) {
        long res = (long)first + (long)second;
        if (res >= 0) return (int)(res % Integer.MAX_VALUE);
        else return (int)(res % Integer.MIN_VALUE);
    }

    //Some simple tests for the sum function.
    public static void main(String[] args) {
        System.out.println("5 + 10 = " + sum(5, 10));
        System.out.println("2147483647 + 28 = " + sum(2147483647, 28));
        System.out.println("-2147483648 - 31 = " + sum(-2147483648, -31));
        System.out.println("-2147483648 + 2147483647 = " + sum(-2147483648, 2147483647));
    }
}