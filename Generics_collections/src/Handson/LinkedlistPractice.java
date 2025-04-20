package Handson;

import java.util.*;

public class LinkedlistPractice {
	public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        System.out.println("Elements: " + integerList);
        integerList.remove(1);
        
        System.out.println("Elements: " + integerList);
        
        
        System.out.println("Removing First Occurence of 20: " + integerList.removeFirstOccurrence(20));
        
        
        System.out.println("Elements: " + integerList);
        System.out.println("Element at second position: " + integerList.get(1));
        integerList.set(0, 50); 

        System.out.println("Element replacing 0th index with 50 : " + integerList);

        int lastIndexOf40 = integerList.lastIndexOf(40);
        System.out.println("Index of last occurrence of 40: " + lastIndexOf40);

        boolean isEmpty = integerList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        System.out.println("Elements in the list:");
//        ListIterator<Integer> iterator = integerList.listIterator();
//        while(iterator.hasNext()) {
//        	System.out.print(iterator.next());
//        }
        

		Iterator < Integer > i = integerList.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
//
            List<Integer> sublist = integerList.subList(1, 4); // Note: end index is exclusive
            System.out.println("Sublist from second to third position: " + sublist);
    

        Object[] array = integerList.toArray();
        System.out.println("Array representation of the list:");
        for (Object element : array) {
            System.out.println(element);
        }

        int size = integerList.size();
        System.out.println("Size of the list: " + size);

        integerList.clear();
        System.out.println("Size of the list after clearing: " + integerList.size());
    }
}

