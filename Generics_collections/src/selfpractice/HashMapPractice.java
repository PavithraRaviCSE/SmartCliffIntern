package selfpractice;

import java.util.*;

public class HashMapPractice {
	public static void main(String args[]) {
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		wordCountMap.put("apple", 5);
        wordCountMap.put("banana", 8);
        wordCountMap.put("cherry", 3);
        wordCountMap.put("date", 6);
        wordCountMap.put("grape", 4);
        System.out.println("wordCountMap: " + wordCountMap);
        
        HashMap<String, Integer> copyMap = new HashMap<>(wordCountMap);
        System.out.println("copyMap: " + copyMap);
        
        System.out.println("Count for 'date': " + wordCountMap.get("date"));
        
        wordCountMap.remove("apple");
        
        System.out.println("Does wordCountMap contain 'banana' " + wordCountMap.containsKey("banana"));
        System.out.println("Does wordCountMap contain count 4 " + wordCountMap.containsValue(4));
        
        System.out.println("Is wordCountMap empty? " + wordCountMap.isEmpty());
        System.out.println("Number of key-value mappings in wordCountMap: " + wordCountMap.size());
        
        for(Map.Entry<String , Integer> e : wordCountMap.entrySet()) {
        	System.out.println(e.getKey() +  e.getValue() );
        }
        Set<String> words = wordCountMap.keySet();
        System.out.println(words);
        
        Collection<Integer> count = wordCountMap.values();
        
        
        Iterator<String> it = words.iterator();	

        
	}
}
