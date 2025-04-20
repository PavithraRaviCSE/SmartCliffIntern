package com.handson;

import java.util.Scanner;

public class ConvertUpperCase {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter at least two string :");
			String string[] = input.nextLine().split(" ");
			if(string.length<2)
				System.out.print("Enter at least two words");
			else
				System.out.print(string[1].toUpperCase());
			
			input.close();
	 }
}
