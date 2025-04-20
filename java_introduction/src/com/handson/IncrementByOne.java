package com.handson;

import java.util.Scanner;

public class IncrementByOne {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number: ");
		int number = input.nextInt();
		number = -~ number;
		System.out.print("number after increment : " + number);
	}
}
