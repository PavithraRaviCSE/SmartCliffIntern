package com.handson;

import java.util.Scanner;

public class ConcatString {


		public static void main(String args[]) {
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the String1: ");
			String string1 = input.next();
			System.out.print("Enter the String2: ");
			String string2 = input.next();
			
			if((string1.charAt(string1.length()-1)) == string2.charAt(0)) {
				String concatedString = string1 + string2.substring(1);
				System.out.print("The String after concatinating: " + concatedString);
			}
			else {
				String concatedString = string1.concat(string2);
				System.out.print("The String after concatinating: " + concatedString);
			}
			input.close();
		}
	}
