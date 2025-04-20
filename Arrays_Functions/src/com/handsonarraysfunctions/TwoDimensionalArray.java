package com.handsonarraysfunctions;

import java.util.Scanner;

public class TwoDimensionalArray {
	
	
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter dimensions of the array (2 3):");
		int row = input.nextInt();
		int column = input.nextInt();
		int array[][] = new int[row][column];
	
		System.out.print("Enter the elements:");	
		for(int i = 0 ; i < row ; i ++)
			for(int j = 0 ; j < column ; j ++)
		    array[i][j] = input.nextInt();
		printArray(array, row, column);
		input.close();
		}
	
	
		static void printArray(int array[][], int row,int column){
			for(int i = 0 ; i < row ; i ++) {
				for(int j = 0 ; j < column ; j ++)
			    System.out.print(array[i][j] + " ");
			
			    System.out.println();
			    
			}
		}
		
		
}
