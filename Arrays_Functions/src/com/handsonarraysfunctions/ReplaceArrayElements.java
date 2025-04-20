//17
package com.handsonarraysfunctions;

import java.util.Scanner;

public class ReplaceArrayElements {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter the size of array:");
	        int size = input.nextInt();
	        int array[] = new int[size];
	        int n = 0;
	        for (int i = 0; i < size; i++) {
	        	n = input.nextInt();
	        	if(n < 0)
	        		break;
	            array[i] = n;
	        }

	        replaceElement(array);

	        input.close();
	 }
	 static void replaceElement(int array[] ) {
		 
	     int arr[] = new int[array.length];
	     
		 for(int i = 0 ; i < array.length ; i ++) {
			 if(array[i]%2 == 0)
				 arr[i] = 0;
			 else 
				 arr[i] = 1;
			 if(array[i]%8 == 0)
				 arr[i] = 2;
			 if(array[i]%10 == 3)
				 arr[i] = 3;
			 if(array[i]%9 == 0)
				 arr[i] = 4;
			
		 }
		 System.out.println("Original array");
		 for(int i = 0 ; i < arr.length ; i ++) {
			 System.out.print(array[i] + " ");
		 }
		 System.out.println("Modified array");
		 for(int i = 0 ; i < arr.length ; i ++) {
			 System.out.print(arr[i] + " ");
		 }
	 }
}
