/*Declare a variable ‘age’. Assign a value to ‘age’ and print the
value of age. Choose the correct datatype for age considering
age as a whole number.*/

package com.handson;
import java.util.Scanner;


public class Age {
	
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter your age: ");
		int age = input.nextInt();
		System.out.println("your age is: " + age);
		input.close();
		
	}

}
