package handsOn;

import linkedList.MyLinkedList;
public class CreationOfLinkedList {
	public static void main(String args[]) {
		MyLinkedList list = new MyLinkedList();
		
		list.insertingAtTheEnd(1);
		list.insertingAtTheEnd(2);
//		list.insertingAtTheEnd(3);
//		list.insertingAtSpecificIndex(1, 5);
		list.insertingAtTheEnd(3);
		list.insertingAtTheEnd(4);
		list.insertingAtTheEnd(5);
		
		list.display();
		
		MyLinkedList list2 = new MyLinkedList();
		
		list2.insertingAtTheEnd(15);
		list2.insertingAtTheEnd(49);
		list2.insertingAtTheEnd(63);
		list2.insertingAtTheEnd(89);
		list2.insertingAtTheEnd(12);
		list2.insertingAtTheEnd(10);
		
		list2.display();
		
		
	}
}
