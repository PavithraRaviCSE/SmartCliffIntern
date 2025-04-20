package com.seifpractice;

import java.util.Scanner;

public class onlyAlphabets {
	
 	public static void main(String args[]) {
			Scanner input =new Scanner(System.in);
			System.out.print("Enter the string:");
			String string=input.next();
			StringBuilder temp = new StringBuilder();
			for (int i = 0; i < string.length(); i++) {
	            char ch = string.charAt(i);
	            if (Character.isLetter(ch)) {
	                temp.append(ch);
	            }
	        }
			System.out.println(temp);
		}
	}


