package com.seifpractice;

import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the string:");
		String string=in.next();
		if (string == null || string.length() <= 1) {
	        System.out.println(string);
	    }

	    StringBuilder newString = new StringBuilder();
	    boolean[] visited = new boolean[256];

	    for (int i = 0; i < string.length(); i++) {
	        char ch = string.charAt(i);
	        if (!visited[ch]) {
	            visited[ch] = true;
	            newString.append(ch);
	        }
	    }

	   System.out.println(newString);
	}

}
