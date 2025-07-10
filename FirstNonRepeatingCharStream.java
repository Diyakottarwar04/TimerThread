import java.util.*;

public class FirstNonRepeatingCharStream {

    public static String firstNonRepeating(String stream) {
        // To keep track of frequency of each character (only lowercase letters)
        int[] count = new int[26];

        // Queue to store characters in the order they appear
        Queue<Character> q = new LinkedList<>();

        // To build the final output string
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input stream
        for (char ch : stream.toCharArray()) {
            // Step 1: Increase frequency count of current character
            count[ch - 'a']++;

            // Step 2: Add the character to the queue
            q.offer(ch);

            // Step 3: Remove all characters from front of queue that are repeating
            while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {
                q.poll(); // remove repeating character
            }

            // Step 4: Check if there’s a non-repeating character
            if (q.isEmpty()) {
                result.append('#'); // No non-repeating character found
            } else {
                result.append(q.peek()); // First non-repeating character
            }
        }

        // Convert final result to string and return
        return result.toString();
    }

    public static void main(String[] args) {
        String stream = "abac"; // 👈 You can try other inputs like "aabc", "aabbcc", etc.
        String output = firstNonRepeating(stream);
        System.out.println("Output: " + output); // Expected Output: aabb
    }
}
