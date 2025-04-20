//2.
package com.handsonarraysfunctions;

import java.util.Scanner;

public class FindIndex {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of names");
		int size = input.nextInt();
		input.nextLine();

		String name[] = new String[size];
		System.out.println("enter names: ");
		for(int i = 0 ; i < size ; i ++)
		    name[i] = input.nextLine();
//		input.nextLine();
		System.out.println("enter a name to find its index: ");
		String findname = input.nextLine();
		
		
		System.out.print(findname + "the position is :" + findIndex(name, findname));
		
		
	}
	static int findIndex(String array[], String findname) {
		int index = -1;
		for(int i = 0 ; i < array.length ; i ++)
		    if(array[i].equals(findname)) {
		    	index = i;
		    	break;
		    }
		if(index == -1) 
			return -1;
			
		return index+1;
	}
}
