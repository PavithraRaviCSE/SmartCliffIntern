package com.handsonarraysfunctions;

import java.util.Scanner;

public class SumUpArrayElement {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elemens: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter the value of 'a': ");
        int a = input.nextInt();
        System.out.print("Enter the value of 'b': ");
        int b = input.nextInt();
        int sum = calculateSumWithCondition(array, a, b);
        System.out.println("Sum of the array elements: " + sum);

        input.close();
    }

	static int calculateSumWithCondition(int[] array, int a, int b) {
	    int sum = 0;
	    boolean a_present = false, b_present = false;
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == b) {
	            b_present = true;
	        } else if (array[i] == a && !b_present) {
	            a_present = true;
	            continue;
	        }
	        
	        sum += array[i];
	    }
	    return sum;
	}
}

