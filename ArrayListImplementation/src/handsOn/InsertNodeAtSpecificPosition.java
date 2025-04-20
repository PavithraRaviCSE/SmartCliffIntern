package handsOn;

import java.util.Scanner;

import linkedList.MyLinkedList;

public class InsertNodeAtSpecificPosition {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
//		
//		1 1 2 3 4 -1
//		1 7 1 2 3 4 -1
		System.out.println("Enter the no of test case: ");
		int t = input.nextInt();
		while (t-- > 0) {
			MyLinkedList list = new MyLinkedList();

			System.out.println("Enter the linked list elements and enter -1 at the end: ");
			int x = input.nextInt();
			while (x != -1) {
				list.insertingAtTheEnd(x);
				x = input.nextInt();
			}

			System.out.println("Enter the emelent and its index to insert it:");
			int num = input.nextInt();
			int position = input.nextInt();
			
//			list.display();
			
			System.out.println("list After inserting the element");
			list.insertingAtSpecificIndex(position, num);
			list.display();
		}
		input.close();
	}
}
