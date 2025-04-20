package com.selfpractice;

import java.util.Scanner;

public class Party {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many of you prefer tea:");
		int tea = input.nextInt();
		System.out.print("Enter how many of you prefer candy:");
		int candy = input.nextInt();
		
		if (tea<5 || candy<5) 
			System.out.println("0");
		
		else if (tea>=(2*candy) || candy>=(2*tea))
			System.out.println("2");
		
		else if (tea >= 5 && candy >= 5) 
			System.out.println("1");
		
		
		input.close();
		
	}
}
