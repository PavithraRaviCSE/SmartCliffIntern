package com.handsonarraysfunctions;

import java.util.Scanner;

public class DistributeChocolate {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter no of friends:");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the no of chocolate each one has:");
		for(int i = 0 ; i < size ; i ++)
		    array[i] = input.nextInt();
		isEquallyDistributed( array);
	}
	static void isEquallyDistributed(int array[]) {
		int sum = 0;
		for(int r : array)
			sum += r;
		System.out.print("Equally Distributed: " + (sum%array.length == 0));
	}
}
