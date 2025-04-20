//16
package com.handsonarraysfunctions;

import java.util.Scanner;

public class MinMaxElementInRowColumn {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the row and column size:");
		int row = input.nextInt();
		int column = input.nextInt();
		int array[][] = new int[row][column];
		System.out.print("Enter the elements:");
		for(int i = 0 ; i < row ; i ++)
			for(int j = 0 ; j < column ; j ++)
		    array[i][j] = input.nextInt();
		
		findMinMax(array,row,column);
	}
	static void findMinMax(int arr[][],int row, int column) {
		int min = arr[0][0];
		int max = arr[0][0];
		for(int i = 0 ; i < row ; i++) {
			min = arr[i][0];
			max = arr[i][0];
			for(int j = 0 ; j < column ; j++) {
				if(arr[i][j]<min)
					min = arr[i][j];
				if(arr[i][j]>max)
					max = arr[i][j];
			}
		   System.out.println("the min and max element is row " + i + " is " + min + " " + max);
		}

	for(int i = 0 ; i < column ; i++) {
		min = arr[0][i];
		max = arr[0][i];
		for(int j = 0 ; j < row ; j++) {
			if(arr[j][i]<min)
				min = arr[j][i];
			if(arr[j][i]>max)
				max = arr[j][i];
			
		}
	    System.out.println("the min and max element is column"
			+ " " + i + " is " + min + " " + max);
	}
				
	}
}
