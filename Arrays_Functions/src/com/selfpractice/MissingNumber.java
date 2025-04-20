package com.selfpractice;

import java.util.Scanner;


public class MissingNumber {
	
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter no of elements:");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements:");
		for(int i = 0 ; i < size-1 ; i ++)
		    array[i] = input.nextInt();
		System.out.println("the missing number is:" + MissingElement(array, size));
		
		
	}
	static int MissingElement(int array[], int n) {
		int sum = 0;
		for(int i = 0 ; i < array.length ; i ++)
		    sum += array[i];
		
		return (((n * (n + 1)) / 2 ) - sum);
	}
}
