package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter string 1:");
			String string1 = input.nextLine();
			string1 = string1.toLowerCase();
			
			System.out.println("Enter string 2:");
			String string2 = input.nextLine();
			string2 = string2.toLowerCase();
			
			System.out.print("Anagram :");
			if(string1.length() != string2.length()) {
				System.out.print(false);
			}
			else {
				char str1[] = string1.toCharArray();
				char str2[] = string2.toCharArray();
				Arrays.sort(str1);
				Arrays.sort(str2);
				for(int i = 0 ; i < str1.length ; i++)
					if(str1[i] != str2[i]) {
						System.out.print("It is not Anagram");
						break;
					}
				System.out.print("Its Anagram");
				
			}
			input.close();
	 }
}
