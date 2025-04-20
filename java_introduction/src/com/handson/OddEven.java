package com.handson;

import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number: ");
		int number = input.nextInt();
		System.out.print(((number & 1) > 0)? "odd number" : "even number");
	}
}
