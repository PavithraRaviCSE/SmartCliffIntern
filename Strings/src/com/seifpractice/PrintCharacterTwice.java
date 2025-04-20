package com.seifpractice;

import java.util.Scanner;

public class PrintCharacterTwice {

		public static void main(String args[]) {
			Scanner input =new Scanner(System.in);
			System.out.print("Enter the string:");
			String string = input.next();
			 StringBuilder newString= new StringBuilder();
			 for (int i = 0; i < string.length(); i++) {
		            char ch = string.charAt(i);
		            newString.append(ch).append(ch);
		        }
			 System.out.println(newString);
		}
	}



