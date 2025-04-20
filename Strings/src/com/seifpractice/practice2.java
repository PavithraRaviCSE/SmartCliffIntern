package com.seifpractice;
import java.util.Scanner;
public class practice2 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);		
		System.out.print("Enter the string1:");
		String string1=input.next();
		System.out.print("Enter the string2:");
		String string2=input.next();
		
		if(string1.length()<string2.length()) {
			System.out.println(string1+" "+string2+" "+string1);
		}
		else {
			System.out.println(string2+" "+string1+" "+string2);
		}
	}
}
