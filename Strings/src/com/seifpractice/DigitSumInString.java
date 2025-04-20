package com.seifpractice;

import java.util.Scanner;

public class DigitSumInString {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the string:");
        String string =input.next();
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
        	
            char ch = string.charAt(i);
            
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println("Sum of digits in the string \"" + string + "\": " +sum );
    }
	        
}
