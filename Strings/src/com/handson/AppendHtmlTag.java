package com.handson;

import java.util.Scanner;

public class AppendHtmlTag {
    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a tag element:");
		String tag = input.next();
		System.out.print("Enter a tag element:");
		String string = input.next();
		System.out.print("<"+tag+">"+ string + "</" + tag+">");
		input.close();
	}
}
