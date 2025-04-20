//19
package com.handsonarraysfunctions;

import java.util.Scanner;

public class jaggedArray {
	 public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	
	    System.out.println("Enter no of teams:");
	    int size = input.nextInt();
	    int array[][] = new int[size][];
	
	    System.out.println("Enter no of players in each team:");
	    for (int i = 0; i < size; i++) {
	        array[i] = new int[input.nextInt()];
	    }
	    System.out.print("Enter the players score:");
	    for (int i = 0; i < size; i++) {
	    	for (int j = 0; j < array[i].length ; j++) {
	    		array[i][j] = input.nextInt();
	    	}
	    }
	    findAverage(array,size);
	    
	    input.close();
	    
	 }
	 static void findAverage(int array[][], int row) {
		 int avg = 0;
		 int sum = 0;
		 for(int i = 0 ; i < row ; i ++) {
			 avg = 0;
			 for(int j = 0 ; j < array[i].length ; j ++)
				 sum += array[i][j];
		     avg = sum/array[i].length;
		     System.out.println("Team " + (i+1) + " average score: " + avg);
		 }
				 
	 }
}
