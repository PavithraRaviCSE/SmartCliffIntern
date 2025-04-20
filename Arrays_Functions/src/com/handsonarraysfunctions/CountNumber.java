//5.
package com.handsonarraysfunctions;

import java.util.Scanner;

public class CountNumber {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter no of elements:");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements:");
		for(int i = 0 ; i < size ; i ++)
		    array[i] = input.nextInt();
		System.out.print("Enter a number to check its element:");
		int number = input.nextInt();
		checkOccurence(array, number);
		
	}
	static void checkOccurence(int array[], int number) {
		int count = 0;
		for(int i = 0 ; i < array.length ; i ++) {
			if(array[i] == number)
				count ++;
				
		}
		System.out.print(number + " occur " + count + " times");
	}
}
