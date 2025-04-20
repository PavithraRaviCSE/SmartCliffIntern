package com.selfpractice;

import java.util.Scanner;

public class OddEvenCount {
	public static void main(String []args ) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a size of array:");
		int size = input.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter a array elements:");
		for(int i = 0 ; i < size; i++) {
			array[i] = input.nextInt();
		}
		
		countOddEven(array,size);
		
		input.close();
	}
		static void countOddEven(int array[],int size) {
			
			int odd=0,even=0;
			
			for(int i = 0 ; i< size; i++) {
				if(array[i] % 2 == 0)
					even++;
				if(array[i]% 2 != 0)
					odd++;
	
			}
			System.out.println("Total Odd number:"+odd);
			System.out.println("Total even number:"+even);
		}
}
