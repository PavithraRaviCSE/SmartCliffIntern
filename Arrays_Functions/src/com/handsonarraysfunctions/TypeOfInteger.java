//1.
package com.handsonarraysfunctions;

import java.util.Scanner;

public class TypeOfInteger {
	
	
	public static void main(String args[]) {

		Scanner input =new Scanner(System.in);
		System.out.print("Enter 20 integer:");
		int array[] = new int[20];
		String name[] = {"positive","negative", "odd", "even", "zero"};
		
		
		for(int i = 0 ; i < 20 ; i ++) {
			array[i] = input.nextInt();
		}
		
		int type[] = calculateType(array);
		
		for(int i = 0 ; i < 5; i ++) {
			System.out.println(name[i] + "numbers: " + type[i]);
		}
		input.close();
	}
	
	
	static int[] calculateType(int array[]) {
		
		int arr[]=new int[5];
		
		for(int i = 0 ; i < 20 ; i ++) {
			if(array[i] > 0)
				arr[0] ++ ;
			if(array[i] < 0)
				arr[1] ++ ;
			if(array[i] % 2 != 0 )
				arr[2] ++ ;
			else
				arr[3] ++ ;
			if(array[i] == 0)
				arr[4] ++ ;
		}
		return arr;
		
	}
}
