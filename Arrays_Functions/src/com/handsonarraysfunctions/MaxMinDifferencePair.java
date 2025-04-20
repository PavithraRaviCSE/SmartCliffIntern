package com.handsonarraysfunctions;

import java.util.Scanner;

public class MaxMinDifferencePair {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter the size of array:");
	        int size = input.nextInt();
	        int array[] = new int[size];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < size; i++) {
	            array[i] = input.nextInt();
	        }
	        
	        minMaxPair(array);
	        
	        input.close();
	        
	 }
	 static void minMaxPair(int array[]) {
		 int min,max;
		 min = max = Math.abs(array[0] - array[1]);
		 int min1 = array[0] ,min2 = array[1] , max1 = array[0], max2 = array[1];
		 for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0 ; j < array.length ; j ++) {
            	if(i == j)
            		continue;
            	if(Math.abs(array[i] - array[j] ) < min) {
            		min1 = array[i];
            		min2 = array[j];
            		min = Math.abs(array[i] - array[j] );
            	}
            	if(Math.abs(array[i] - array[j] ) > max) {
            		max = Math.abs(array[i] - array[j] );
            		max1 = array[i];
            		max2 = array[j];
            		
            	}
            		
            }
        }
		 System.out.println("Min pair: " + min1 + ", " + min2);
		 System.out.println("Max pair: " + max1 + ", " + max2);
	}
}
