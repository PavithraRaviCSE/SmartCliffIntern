package Handson;

import java.util.*;

public class ListPractice {

	public static void main(String args[]) {
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("grapes");
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("grapes");
		
		for(String c : stringList) {
			System.out.print(c + " ");
		}
		
		stringList.remove(2);
		System.out.println("2nd index element is reomved");
		
//		for(String c : stringList) {
//			System.out.print(c + " ");
//		}
		
		System.out.println("Arraylist elements: " + stringList);
		stringList.remove("banana");
		
		for(String c : stringList) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("element at first index: " + stringList.get(1));
		
		stringList.set(0, stringList.get(0));
		
		System.out.println("element at 0 th  index is changed ");
		
		System.out.println("Arraylist elements: " + stringList);
		
		System.out.println("is contains orange : " + stringList.contains("orange"));
		
		System.out.println("the last occurenc of grape : " + stringList.lastIndexOf("grapes"));
		
		System.out.println("Is the list is empty :"  + stringList.isEmpty());
		
		ArrayList<String> newList = new ArrayList<>();
		
		newList.add("kiwi");
		newList.add("pineapple");
		newList.add("melon");
		
		stringList.addAll(2,newList);
		
		System.out.println("The new arraylist : " + stringList);
		
		System.out.println("the size of the give list :  " + stringList.size());
//		System.out.println("the capacity of the give list :  " + stringList.capacity());
		
		System.out.println("clearing string");
		stringList.clear();
		System.out.println("Size of string: " + stringList.size());
		
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("grapes");
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("grapes");
		
		Iterator < String > i = stringList.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		List<String> sub = stringList.subList(1, 3);
		
		System.out.println("List : "  + sub);
		
		Object[] objects = stringList.toArray();
		 
        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
        
        System.out.println("to array: " + stringList);
//        
//        String[] object = (String[]) stringList.toArray();
		 
        
        System.out.println("to array: " + stringList);
		
		stringList.sort(null);
		
		System.out.println(stringList);
		
		System.out.println("is string equals to newlist:  "+stringList.equals(objects));
		
		System.out.println("HASH CODE: " + stringList.hashCode());
		
//		System.out.println("Reversed string: " + stringList.reverse());
		
		Collections.sort(stringList);
		
        Collections.sort(stringList, new Comparator<String>() {        
        	public int compare(String o, String i) {
        		return o.compareTo(i);
        	}
        }
		);
        
        System.out.println("sort using comparator: "+stringList);
        
        Collections.sort(stringList, new Comparator<String>() {        
        	public int compare(String o, String i) {
        		return i.compareTo(o);
        	}
        }
        		);
		System.out.println("reverse order: "+stringList);
		
		
		
		
	}
}
