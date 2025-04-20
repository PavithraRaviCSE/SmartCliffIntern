package com.seifpractice;

import java.util.Scanner;

public class OccurenceOfCharacter {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String string = input.next();
		
		System.out.print("Enter the Character: ");
		char c = input.next().charAt(0);
		
		int frequency = 0;
		for (int i = 0 ; i < string.length() ; i++) {
			if (string.charAt(i) == c) {
				frequency++;
			}
		}
		
		System.out.print("The given character apprear " + frequency + " times in the given string");
	}
}
