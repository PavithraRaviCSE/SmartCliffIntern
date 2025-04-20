package com.selfpractice;

import java.util.Scanner;

public class ArrayFrequency {
	    public static void main(String[] args) {
	    	Scanner input=new Scanner(System.in);
	    	
	    	System.out.println("Enter a size of array:");
			int size = input.nextInt();
			int array[] = new int[size];	
			
			System.out.println("Enter a array elements:");
			for(int i = 0 ; i < size; i++) {
				array[i] = input.nextInt();
			}
			
			System.out.println("Enter grade to find its occurence:");
			int grade = input.nextInt();
			int occurrences = findFrequency(array,grade);
	       
	        System.out.println("The grade " + grade + " appears " +
	        occurrences + " times in the array.");
	        
	        input.close();
	    }

	    public static int findFrequency(int[] arr, int grade) {
	        int count = 0;
	        for (int score : arr) {
	            if (score == grade) {
	                count++;
	            }
	        }
	        return count;
	    }
}
