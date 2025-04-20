package com.handson;

import java.util.Scanner;

public class LowerUpperString {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter a sentence:");
			String string = input.nextLine();
			System.out.println("Enter a string:");
			String temp = "";
			String str = input.nextLine();
			if(string.contains(str))
				for(int i = 0 ; i < string.length() ; i ++) {
					if(Character.isLowerCase(string.charAt(i))){
						temp += Character.toUpperCase(string.charAt(i));
						
					}
					else{
						temp += Character.toLowerCase(string.charAt(i));
					}
				}
			System.out.print(temp);
			input.close();
	 }
}
