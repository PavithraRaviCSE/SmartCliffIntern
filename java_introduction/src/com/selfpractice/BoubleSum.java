package com.selfpractice;

import java.util.Scanner;

public class BoubleSum {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number : ");
		int number1 = input.nextInt();
		System.out.println("enter another number : ");
		int number2 = input.nextInt();
		if(number1 == number2)
			System.out.print(2 * (number1 + number2));
		else
			System.out.print(number1 +  number2);
		
		input.close();
	}
}
