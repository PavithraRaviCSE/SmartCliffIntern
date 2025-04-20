package handsOn;

import java.util.Scanner;

import linkedList.MyLinkedList;

public class DeleteAtBeginning {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		MyLinkedList list = new MyLinkedList();
		
		System.out.println("Enter the linked list elements and enter -1 at the end: ");
		int x = input.nextInt() ;
		while(x != -1 ) {
			list.insertingAtTheEnd(x);
			x = input.nextInt();
		}
		
		list.deleteAtTheBegining();
		
		list.display();
	}
}
