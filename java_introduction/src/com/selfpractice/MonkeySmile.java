package com.selfpractice;

import java.util.Scanner;

public class MonkeySmile {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter true if monkey A is smiling or else enter false: ");
		boolean aSmile = input.nextBoolean();
		System.out.println("enter true if monkey B is smiling or else enter false: ");
		boolean bSmile = input.nextBoolean();
		if(aSmile && bSmile||(!aSmile && !bSmile)) 
		    System.out.println("true");
		else
		    System.out.println("false");
		
		input.close();
		
	}	
}
