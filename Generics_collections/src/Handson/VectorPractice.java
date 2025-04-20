package Handson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorPractice {
	public static void main(String args[]) {
		Vector<String> flowerVector = new Vector<>();
		flowerVector.add("apple");
		flowerVector.add("banana");
		flowerVector.add("orange");
		flowerVector.add("grapes");
		flowerVector.add("apple");
		flowerVector.add("banana");
		flowerVector.add("orange");
		flowerVector.add("grapes");
		
		for(String c : flowerVector) {
			System.out.print(c + " ");
		}
		
		flowerVector.remove(2);
		System.out.println("2nd index element is reomved");

		
		System.out.println("vector elements: " + flowerVector);
		
	    System.out.print(flowerVector.remove("banana"));

		System.out.println(flowerVector);
		
		System.out.println("is contains orange : " + flowerVector.contains("orange"));
		
		System.out.println("Is the list is empty :"  + flowerVector.isEmpty());
		
		System.out.println("the size of the give list :  " + flowerVector.size());

		System.out.println("Size of string: " + flowerVector.size());
		
		flowerVector.ensureCapacity(flowerVector.capacity() + 10);
		
		flowerVector.add("apple");
		flowerVector.add("banana");
		flowerVector.add("orange");
		flowerVector.add("grapes");
		flowerVector.add("apple");
		flowerVector.add("banana");
		flowerVector.add("orange");
		flowerVector.add("grapes");
		
		flowerVector.trimToSize();
		
		Iterator < String > i = flowerVector.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		List<String> sub = flowerVector.subList(1, 3);
		
		System.out.println("List : "  + sub);
		
		Object[] objects = flowerVector.toArray();
		 
        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
        
        System.out.println("to array: " + flowerVector);
//        
//        String[] object = (String[]) stringList.toArray();
		 
        
        System.out.println("to array: " + flowerVector);
		
		flowerVector.sort(null);
		
		System.out.println(flowerVector);
		
		System.out.println(flowerVector.equals(objects));
		
		System.out.println("HASH CODE: " + flowerVector.hashCode());
		
//		System.out.println("Reversed string: " + stringList.reverse());
		
		
	}
}
