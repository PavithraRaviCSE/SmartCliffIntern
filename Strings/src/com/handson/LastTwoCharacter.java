package com.handson;

import java.util.Scanner;

public class LastTwoCharacter {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter a string:");
			String string = input.nextLine();
			int len =string.length();
			if(len == 1 ) {
				System.out.print("String Length should be atleast Two");
			}
			else {
			String st = string.substring(len-2);
			System.out.print(st+st+st);
			}
			
			input.close();
	 }
}
