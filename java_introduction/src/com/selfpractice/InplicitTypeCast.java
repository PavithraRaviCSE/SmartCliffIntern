package com.selfpractice;

import java.util.Scanner;

public class InplicitTypeCast {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int price = 52;
		float priceInFloat = price;
		System.out.println("Int to Float: " + priceInFloat);
		
		byte age = 83;
		int intAge = age;
		System.out.println("Byte to Int: " + intAge);
		
		int highestAge = 120;
		byte byteAge = (byte)highestAge;
		System.out.println("Int to Byte: " + byteAge);
		
		highestAge = 130;
		byteAge = (byte)highestAge;
		System.out.println("ByteAge:" + byteAge);
		input.close();
	}
}
