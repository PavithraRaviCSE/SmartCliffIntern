package com.selfpractice;

import java.util.Scanner;

public class TwoNonNegativeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first non-negative integer: ");
        int a = input.nextInt();
        System.out.println("Enter the second non-negative integer: ");
        int b = input.nextInt();

        int sum = a + b;

        int a_length = String.valueOf(a).length();

        int sum_length = String.valueOf(sum).length();

        if (sum_length == a_length) {
            System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        } else {
            System.out.println("Sum of " + a + " and " + b + " is: " + a);
        }

        input.close();
    }
}
