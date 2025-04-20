package com.handson;

import java.util.Scanner;

public class BadString {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter a string:");
			String string = input.nextLine();
			System.out.print("the given string is starts with bad :"+(string.startsWith("bad")
					|| string.substring(1,4).equals("bad")));
			input.close();
	 }
}
