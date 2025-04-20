package listImplementation;

import arrayList.MyArrayList;

public class ArrayListImplementation {
	
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		MyArrayList list = new MyArrayList(10);
		
		System.out.println("Creating list");
		list.createArrayList(arr);
		list.display();
		
		System.out.println("Trying to delete element at the index 14");
		list.deleteAtIndex(14);
		
		System.out.println("Delete element at the index 3");
		list.deleteAtIndex(3);
		list.display();
		
		System.out.println("Delete at the beginning");
		list.deleteAtBeginning();
		list.display();
		
		System.out.println("Delete at the end");
		list.deleteAtEnd();
		list.display();
		
		System.out.println("Trying to insert element is invalid index 10");
		list.insertAtSpecificIndex(10, 5);
		
		System.out.println("size: " + list.size());
		System.out.println("capacity: " + list.capacity());
		
		System.out.println("insert 1 in the beginning");
		list.insertAtBeginning(1);
		list.display();
		
		System.out.println("insert 10 in the end of the list");
		list.insertAtEnd(10);
		list.display();
		
		System.out.println("Trying to insert an element is invalid index");
		list.insertAtSpecificIndex(14, 5);
		
		System.out.println("inserting 4 in the index 3");
		list.insertAtSpecificIndex(3, 4);
		list.display();
		
		System.out.println("size: " + list.size());
		System.out.println("capacity: " + list.capacity());

		System.out.println("Index of 5: " + list.indexOf(5));
		System.out.println("Index of 15: " + list.indexOf(15));
		
		System.out.println("Inserting the element");
		list.insertAtBeginning(5);
		
		list.clear();
		
		System.out.println("Displaying empty list");
		list.display();
		
		System.out.println("Delete element in empty list");
		list.deleteAtBeginning();
		
	}
}
