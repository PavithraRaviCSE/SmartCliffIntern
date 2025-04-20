package com.handson;

import java.util.Scanner;

public class FindMinDistance {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter array elements: ");
			String string[] = input.nextLine().split(" ");
			System.out.print("Enter a string :");
			String str1 = input.nextLine();
			
			System.out.print("Enter a string :");
			String str2 = input.nextLine();
			
			int firstIndex= -1 , secondIndex = -1;
			outer:
			for(int i = 0 ; i < string.length ; i++) {
				if (string[i].equals(str1)) {
					firstIndex = i ;
					for (int j = i+1 ; j < string.length ; j++) {
						if (string[j].equals(str2)) {
							secondIndex = j;
							System.out.print("The Min distance Between the Given words is: ");
							System.out.print(secondIndex - firstIndex);
							break outer;
						}
					}
				}
			}
			input.close();
	}
}
