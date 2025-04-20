package selfpractice;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapPractice {
	public static void main(String args[]) {
		TreeMap<String, Integer> studentMap = new TreeMap<>();
		studentMap.put("Alice", 20);
        studentMap.put("Bob", 22);
        studentMap.put("Charlie", 18);
        studentMap.put("David", 25);
        studentMap.put("Eva", 21);
        System.out.println("TreeMap: " + studentMap);
        
        studentMap.remove("Charlie");
        System.out.println("TreeMap contains key bob: " + studentMap.containsKey("Bob"));
        
        System.out.println("TreeMap size: " + studentMap.size());
        System.out.println("TreeMap is empty: " + studentMap.isEmpty());
        
        System.out.println("TreeMap: " + studentMap);
        
        System.out.println(studentMap.firstEntry());
        System.out.println(studentMap.firstKey());
        System.out.println(studentMap.firstKey());
        System.out.println(studentMap.lastKey());
        System.out.println(studentMap.lastEntry());
        
//        System.out.println(studentMap.pollFirstEntry());
        System.out.println(studentMap.remove("Charlie"));
        
        System.out.println("TreeMap: " + studentMap);
        System.out.println("removing last element : " + studentMap.lastEntry());
        
        System.out.println("TreeMap: " + studentMap);
        

        for (Entry<String, Integer> element : studentMap.entrySet()) {
            System.out.println(element.getKey()  + " : "  +element.getValue());
        }
        for (String key : studentMap.keySet()) {
        	System.out.println(key + " : "  + studentMap.get(key));
        }
        System.out.println(studentMap.lastEntry());
        Entry<String, Integer> maxEntry = studentMap.lastEntry();
        System.out.println("Entry with maximum key: " + maxEntry.getKey() + " : " + maxEntry.getValue());
        
        
        
        
        
	}
}
