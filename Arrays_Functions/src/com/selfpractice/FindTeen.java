package com.selfpractice;

import java.util.Scanner;

public class FindTeen {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter number1: ");
		int num1 = input.nextInt();
		System.out.println("enter number2: ");
		int num2 = input.nextInt();
		if(num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19)
			System.out.println("19");
		else
			System.out.println(num1 + num2);
			
	}
			
}
