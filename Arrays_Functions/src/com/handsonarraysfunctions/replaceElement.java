//8
package com.handsonarraysfunctions;

import java.util.Scanner;

public class replaceElement {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter no of elements:");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements:");
		for(int i = 0 ; i < size ; i ++)
		    array[i] = input.nextInt();
		
		array = replaceMultiple(array);
		for(int k = 0 ;k < array.length ; k ++)
			System.out.print(array[k] + " ");
	}
	static int[] replaceMultiple(int array[]) {
		int arr[] = new int[array.length];
		int product = 1;
		for(int i = 0 ; i< array.length ; i++) {
			product = 1;
			for(int j = 0 ; j < array.length ; j ++) {
				if(i == j)
					continue;
				product *= array[j];
			}
			arr[i] = product;
//			System.out.print(product + " ");
		}
		return arr;
		
	}
}
