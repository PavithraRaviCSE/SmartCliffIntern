package com.seifpractice;

import java.util.Scanner;

public class ReplaceLastTwo {

		public static void main(String args[]) {
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the string:");
			String string=input.next();
			if(string.length() >=2) {
				char a = string.charAt(string.length()-1);
				char b = string.charAt(string.length()-2);
				System.out.println(string.substring(0,string.length()-2)+ a + b);
			}
			else {
				System.out.print("enter atlease two character");
			}
		}
}
