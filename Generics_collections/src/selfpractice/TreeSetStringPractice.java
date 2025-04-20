package selfpractice;

import java.util.TreeSet;

public class TreeSetStringPractice {
	public static void main(String args[]) {
		TreeSet<String> stringSet = new TreeSet<>();
		stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cherry");
        stringSet.add("date");
        stringSet.add("kiwi");
        stringSet.add("orange");
        
        System.out.println("TreeSet: " + stringSet);
        
        stringSet.add("grape");
        
        System.out.println("TreeSet: " + stringSet);
        
        stringSet.remove("date");
        
        System.out.println("TreeSet: " + stringSet);
        System.out.println("TreeSet conatins banana: " + stringSet.contains("banana"));
        System.out.println("TreeSet is empty: " + stringSet.isEmpty());
        System.out.println("TreeSet size: " + stringSet.size());
        for (String element : stringSet) {
            System.out.print(element  + " ");
        }
        System.out.println();
        
        System.out.println(stringSet.first());
        System.out.println(stringSet.last());
        
        System.out.println(stringSet.pollFirst());
        System.out.println("TreeSet: " + stringSet);
        System.out.println(stringSet.pollLast());
        System.out.println(stringSet.last());
        
        System.out.println("TreeSet: " + stringSet);
        
        
        
        
	}
}
