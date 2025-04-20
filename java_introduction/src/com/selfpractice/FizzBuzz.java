package com.selfpractice;

import java.util.Scanner;

public class FizzBuzz {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter the positive number: ");
	        int a = input.nextInt();
	        String result = "";
	        if(a % 3 == 0)
	        	result += "Fizz";
	        if (a % 5 == 0)
	            result += "Buzz";
	        
	        if(a % 5 != 0 && a % 3 != 0)
	        result = a + "!";

	        System.out.println("Output: " + result);
	        
	        input.close();
	    }
}
