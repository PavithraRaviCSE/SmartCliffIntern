//12
package com.handsonarraysfunctions;

import java.util.Scanner;

public class SplitArray {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		int sum = 0, average = 0;
		System.out.print("Enter no of elements:");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements:");
		
		for(int i = 0 ; i < size ; i ++) {
		    array[i] = input.nextInt();
		    sum += array[i];
		}
		average = sum/size;
		splitArray(array,average);
		input.close();
	}
	static void splitArray(int array[], int avg) {
		int arr1[] = new int[array.length];
		int arr2[] = new int[array.length];
		int index1 = 0,index2 = 0;
		for(int i = 0 ; i < array.length ; i ++)
		    if(array[i]<= avg)
		    	arr1[index1++] = array[i];
		    else
		    	arr2[index2++] = array[i];
		System.out.println( "array1: ");
		for(int j = 0 ; j < index1 ; j ++)
				System.out.print(arr1[j] + " ");
		System.out.println( "array2: ");
		
		for(int j = 0 ; j < index2 ; j ++)
				System.out.print(arr2[j] + " ");
	}
}
