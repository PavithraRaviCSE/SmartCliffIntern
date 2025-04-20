/*Write a Java program to detect if two integers have opposite signs
or not. Don’t use relational operator.*/

package com.handson;

import java.util.Scanner;

public class DetectOppositeSign {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number: ");
		int number1 = input.nextInt();
		System.out.println("enter a number: ");
		int number2 = input.nextInt();
		
		System.out.print(((number1^number2)<0)? "they have opposite sign" : "same sign"); 
	}
}
