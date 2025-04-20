/*The total number of students in a class are 90 out of which 45 are
boys. If 50% of the total students secured grade 'A' out of which
20 are boys, then write a program to calculate the total number
of girls getting grade 'A'.*/

package com.handson;

import java.util.Scanner;

public class StudentsGrade {
	public static void main(String args[]) {
		
		int total_students = 90;
		int boys = 45;
		int A_grade_students = (50 * 90) / 100;
		int A_grade_boys  = 20;
		System.out.println("total no of Students: " + total_students);
		System.out.println("total no of boys: " + boys);
		System.out.println("total no of A grade students: " + A_grade_students);
		System.out.println("total no of boys with A rade is: " + A_grade_boys);
		
		System.out.print("total no of girls with A grade is: " + (A_grade_students - A_grade_boys));
		
	}
}
