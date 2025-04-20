package selfpractice;

import java.util.*;
import java.util.HashSet;
public class HashSetPractice {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<>();
		HashSet<String> additionalset = new HashSet<>();
		HashSet<String> removeset = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("grapes");
		
		additionalset.add("mango");
		additionalset.add("pome");
		additionalset.add("lemon");
		
		set.addAll(additionalset);
		removeset.addAll(additionalset);
		
		set.remove("banana");
		
		removeset.clear();
		System.out.println("is empty"  + removeset.isEmpty());
		
		System.out.println("is empty: " + set.isEmpty());
		
		set.add("apple");
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("grapes");
		
		System.out.println("remove " + set.remove("apple"));
		System.out.println(set);
		
		System.out.println("contains : "  +  set.contains("orange"));
		System.out.println("size: "  +  set.size());
		System.out.println("is empty "  +  set.size());
		
		for(String c : set) {
			System.out.print(c + " ");
		}
		
		 String[] array = set.toArray(new String[0]);
		 
		 
		
		
		System.out.println(array.toString());
		
		HashSet<String> retainSet = new HashSet<>();
		
		retainSet.addAll(additionalset);
		System.out.println("the stringset" + set);
		System.out.println("the retainset" + retainSet);
//		hashSet<String> newset = new hashSet<>(set.retainAll(retainSet));
		System.out.println();
		System.out.println(set);
		
		
		Iterator<String> it = set.iterator();	
		
		
		
		
		
		
		
		
	}
}
