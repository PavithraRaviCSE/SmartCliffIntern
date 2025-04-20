package com.handsonarraysfunctions;

import java.util.Scanner;

public class FindPair {
		public static void main(String args[]) {
			Scanner input =new Scanner(System.in);
			System.out.print("Enter no of elements:");
			int size = input.nextInt();
			int array[] = new int[size];
			System.out.print("Enter the elements:");
			for(int i = 0 ; i < size ; i ++)
			    array[i] = input.nextInt();
			System.out.print("Enter the elements it find its pair:");
			int k = input.nextInt();
			findPair(array, k);
			
			
		}
		
		static void findPair(int array[], int k) {
			outerloop:
			for(int i = 0;i< array.length - 1 ; i++)
				for(int j = i + 1 ;j< array.length ; j++) {
					if(array[i] + array[j] == k)
					{
						System.out.print(array[i] + "," + array[j]);
						break outerloop;
					}
				}
				
		}
	
}
