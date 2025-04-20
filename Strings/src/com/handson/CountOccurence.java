package com.handson;

import java.util.Scanner;

public class CountOccurence {
	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter a sentence : ");
	String string[] = input.nextLine().split(" ");
	System.out.print("enter a text: ");
	String str = input.nextLine();
	int count = 0;
	for(int i = 0 ; i < string.length ; i ++) {
		if(string[i].equals(str))
			count++;
//		else System.out.println("..." + string[i]);
	}
	System.out.print(str + " occurs: " + count + " times");
	input.close();
	}
}
