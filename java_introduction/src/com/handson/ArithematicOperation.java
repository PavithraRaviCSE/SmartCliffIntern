/*Write a Java program to add 8 to the given number and then
divide it by 3. Now, the modulus of the quotient is taken with 5,
and then multiply the resultant value by 5. Display the result.*/

package com.handson;

import java.util.Scanner;

public class ArithematicOperation {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = input.nextInt();
		int result = number + 8;
		result /= 3;
		result %= 5;
		result = result * 5;
		System.out.print("result: " + result);
		
	}
}
