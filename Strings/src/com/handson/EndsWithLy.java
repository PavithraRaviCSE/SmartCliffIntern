package com.handson;

import java.util.Scanner;

public class EndsWithLy {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter a string:");
			String string = input.nextLine();
			System.out.print("the given string is ends with ly :"+string.endsWith("ly"));
			input.close();
			
	 }
}
