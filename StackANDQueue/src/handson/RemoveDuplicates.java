package handson;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "aabbccddeeff";

        String result = removeConsecutiveDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("String: " + result);
    }

    public static String removeConsecutiveDuplicates(String input) {
        Queue<Character> queue = new LinkedList<>();
        
        for (char c : input.toCharArray()) {
            queue.add(c);
        }

        StringBuilder res = new StringBuilder();
        
        while (!queue.isEmpty()) {
            char c = queue.remove();
            if (!queue.isEmpty()) {
                char p = queue.peek();
                if (c != p) {
                    res.append(c);
                }
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}

