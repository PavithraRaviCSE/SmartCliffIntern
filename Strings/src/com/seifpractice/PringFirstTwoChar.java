package com.seifpractice;

import java.util.Scanner;

public class PringFirstTwoChar {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string:");
		String input = in.next();
		if (input.length() >= 2) {
            System.out.println(" "+ input.substring(0, 2));
        } 
		else {
            System.out.println(" "+ (input + "@"));
        }
	}
}



