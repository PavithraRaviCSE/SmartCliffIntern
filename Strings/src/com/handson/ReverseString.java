package com.handson;

import java.util.Scanner;

public class ReverseString {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter a string:");
			String string = input.nextLine();
			char str[] = string.toCharArray();
			String temp = "";
			for(int i = string.length()-1 ; i >= 0 ; i--)
				temp += str[i];
			
			System.out.print(temp);
			input.close();
	 }
}
