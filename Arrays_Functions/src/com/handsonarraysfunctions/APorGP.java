package com.handsonarraysfunctions;

import java.util.Scanner;

public class APorGP {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter no of elements:");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements:");
		for(int i = 0 ; i < size ; i ++)
		    array[i] = input.nextInt();
		findAPorGP(array);
		input.close();
	}
	static void findAPorGP(int array[]){
		int a = array[0];
		int difference = array[1] - array[0];
		int devisor = array[1] / array[0];
		int flag = 0;
		for(int i=1;i<array.length-1;i++) {
			if(array[i+1]-array[i] != difference) {
				flag = 0;
				break;		
			}
				flag = 1;
			
				
		}
		if(flag == 0)
		for(int i=1;i<array.length-1;i++) {
			if(array[i+1]%devisor!= 0) {
				flag = 0;
				break;
				
			}
			flag = 2;
			
		}
		if(flag == 1) {
			System.out.print("the given array is AP");
		}
		if(flag == 2) {
			System.out.print("the given array is GP");
		}
		else {
			System.out.print("the given array is neither AP or GP");
		}
	}
}
