//11
package com.handsonarraysfunctions;

import java.util.Scanner;

public class FindCommonElement {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter no of students in NSS and NCC:");
		int nss = input.nextInt();
		int ncc = input.nextInt();
		int array1[] = new int[nss];
		int array2[] = new int[ncc];
		
		System.out.print("Enter id of students in NSS:");
		for(int i = 0 ; i < nss ; i ++)
		    array1[i] = input.nextInt();
		System.out.print("Enter id of students in NCC:");
		for(int i = 0 ; i < ncc ; i ++)
			array2[i] = input.nextInt();
		FindId(array1,array2);
	}
	static void FindId(int array1[],int array2[]) {
		for(int i = 0 ; i < array1.length ; i ++) {
			for(int j = 0 ; j < array2.length ; j ++)
				if(array1[i] == array2[j])
					System.out.print(array1[i] + " ");
		}
	}
}
