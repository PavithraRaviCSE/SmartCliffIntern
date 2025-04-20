package com.selfpractice;

import java.util.Scanner;

public class TressureHunt {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter no of landmarks:");
	    int size = input.nextInt();
	    int array[] = new int[size];
	    System.out.print("Enter the tressure value:");
	    
		for(int i = 0 ; i < size ; i ++)
		    array[i] = input.nextInt();
		
		findTressure(array);
	}
	static void findTressure(int array[]) {
		int max = array[0];
		for(int i = 0 ; i < array.length ; i ++) {
			if(array[i]>max)
				max = array[i];
		}
		System.out.print("the max tressure is " + max);
	}
}
