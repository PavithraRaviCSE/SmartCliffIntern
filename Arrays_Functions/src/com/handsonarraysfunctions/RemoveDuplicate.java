//4.
package com.handsonarraysfunctions;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter no of elements:");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements:");
		for(int i = 0 ; i < size ; i ++)
		    array[i] = input.nextInt();
		findIndex(array, size);
		
		
    }
	static void findIndex(int array[], int size) {
	
		for(int i = 0 ; i < size ; i ++)
			for(int j = i + 1 ; j < size ; j ++) {
				if(array[i] == array [j])
				{
					for(int k = j ; k < size - 1 ; k ++)
						array[k] = array[k+1];
					size --;
					
				}
			}
				
				
		for(int i = 0 ; i < size ; i ++)
			 System.out.print(array[i] + " "); 
			
		    
    }
}
