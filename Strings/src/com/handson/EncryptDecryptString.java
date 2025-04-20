package com.handson;

import java.util.Scanner;

public class EncryptDecryptString {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter a string:");
			String string = input.nextLine();
			String encrypt = "";
			String decrypt = "";
			for(int i = 0; i < string.length() ; i++) {
				encrypt += (char)((string.charAt(i)+2));
			}
			System.out.println("encryption :" + encrypt);
			for(int i = 0; i < string.length() ; i++) {
				decrypt += (char)(encrypt.charAt(i)-2);
			}
			System.out.print("decryption :" + decrypt);
			input.close();

	 }
}
