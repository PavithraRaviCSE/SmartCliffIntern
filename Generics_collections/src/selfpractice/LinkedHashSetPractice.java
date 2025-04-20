package selfpractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	public static void main(String args[]) {
		LinkedHashSet<String> wordSet = new LinkedHashSet<>();
		
		wordSet.add("dog");
        wordSet.add("cat");
        wordSet.add("bird");
        wordSet.add("fish");
        wordSet.add("rabbit");
        wordSet.add("turtle");
        System.out.println("wordset : " + wordSet);
        wordSet.add("horse");
        System.out.println("wordset : " + wordSet);
        wordSet.remove("bird");
        System.out.println("wordset : " + wordSet);
        
        System.out.println("wordset contains fish?: " +wordSet.contains("fish"));
        System.out.println("Is wordSet empty? " + wordSet.isEmpty());
        System.out.println("size " + wordSet.size());
        
        Iterator<String> iterator = wordSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Object[] obj = wordSet.toArray();
        System.out.println("array: " + obj.toString());
        
        System.out.println("Hash code of wordSet: " + wordSet.hashCode());
        
        wordSet.clear();
        System.out.println("wordSet after clearing: " + wordSet);
        
	}
}
