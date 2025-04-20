/*Create two variables to store a student's name and his/her age.
Assign/initialize them with the appropriate values and display
the data. */

package com.handson;

import java.util.Scanner;

public class Student {
	public static void main(String args[]) {
		
	Scanner input=new Scanner(System.in);
	String student_name;
	int student_age;
	System.out.print("Enter your name: ");
	student_name=input.nextLine();
	System.out.print("Enter your age: ");
	student_age=input.nextInt();
	System.out.println("Your name: " + student_name);
	System.out.println("your age: " + student_age);
	input.close();
	
	}
}
