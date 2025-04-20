package com.handson;

import java.util.Scanner;

public class ReplaceWithZ {
	 public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter string :");
			StringBuffer string = new StringBuffer(input.next());
			for(int i=0;i<string.length();i++) {
				char c = string.charAt(i);
				if(c =='a'|| c == 'A'||c =='e'|| c == 'E'||
				   c =='i'|| c == 'I'||c =='o'||
				   c == 'O'||c =='u'|| c == 'U')
					string.setCharAt(i, 'f');
			}
			System.out.print(string);
			input.close();
	 }
}
