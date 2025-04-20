package handsOn;

import java.util.Scanner;

import linkedList.MyLinkedList;

public class InsertInMiddleOfLinkedList {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		MyLinkedList list = new MyLinkedList();
		
		System.out.println("Enter the linked list elements and enter -1 at the end: ");
		int x = input.nextInt() ;
		while(x != -1 ) {
			list.insertingAtTheEnd(x);
			x = input.nextInt();
		}
		
		System.out.println("Enter the element to insert : ");
		int num = input.nextInt();
		
		int n = list.size();
		
		int index = n/2;
		if(n%2 != 0) {
			index += 1;
		}
//		System.out.println(index);
		list.insertingAtSpecificIndex(index,num);
		
		list.display();
	}
}
