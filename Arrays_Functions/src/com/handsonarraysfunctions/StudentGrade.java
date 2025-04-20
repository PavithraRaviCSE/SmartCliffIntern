package com.handsonarraysfunctions;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter no of students:");
	    int size = input.nextInt();
	
	    System.out.println("Enter no of assignment: ");
	    int noOfAssignment = input.nextInt();

	    int grade[][] = new int[size][noOfAssignment];
	    for (int i = 0; i < size; i++) {
	    	System.out.println("Enter student "+ (i+1) + " assignment all assignment score:"  );
	    	for (int j = 0; j < size; j++) {	
//	    		System.out.println("Enter assignment " + j  + " grade : ");
	    		grade[i][j] = input.nextInt();
	    		
	    	}
	    }
	    average(grade, size, noOfAssignment);
	    
	}
	static void average(int grade[][], int student, int n) {
		int sum;
		for(int i = 0 ; i< student ; i ++) {
			sum = 0;
			System.out.print("Student " + (i+1) + "agerage : ");
			for(int j = 0 ;j< n; j++) {
				sum += grade[i][j];
			}
			System.out.println(sum/n);
		}
	}
}
