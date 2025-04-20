package com.seifpractice;

import java.util.Scanner;

public class Print12Characters {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter string :");
			String str = input.nextLine();
			if(str.length()<2)	
				System.out.print("enther atleast 2 character");
			else
				System.out.print(str.charAt(0)+""+str.charAt(1));
			}
}
	 
