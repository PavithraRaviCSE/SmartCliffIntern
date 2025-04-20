package com.seifpractice;

import java.util.Scanner;
import java.util.Arrays;

public class ShortArray {

	public static void main(String args[]) {
		
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the names :");
		
		String name[]=input.next().split(" ");
		Arrays.sort(name);
		
		System.out.println("Sorted names:");
        for (String st : name) 
            System.out.println(st);
        
	}
}
