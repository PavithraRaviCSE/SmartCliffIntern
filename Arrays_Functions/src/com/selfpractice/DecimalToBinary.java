package com.selfpractice;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter a number");
	    int number = input.nextInt();
		calculateBinary(number);
	}
	static void calculateBinary(int num) {
		if(num == 0);
		System.out.print("0");
				
		String binary = "";
		while(num > 0) {
			int remainder = num%2;
			binary  = remainder + binary;
			num = num / 2;
		}
		System.out.print("binary value " + binary);
	}
}
