//Write a Java program to reverse a 3-digit number.

package com.handson;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three digit number: " );
		int number = input.nextInt();
		int reverse=0;
		
		int temp = number % 10;
		reverse *= 10;
		reverse += temp;
		number /= 10;
		
		temp = number % 10;
		reverse *= 10;
		reverse += temp;
		number /= 10;
		
		
		temp = number % 10;
		reverse *= 10;
		reverse += temp;
		
		System.out.println("reversed digit is: " + reverse);
	}
	
}
