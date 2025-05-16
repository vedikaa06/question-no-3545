import java.util.*;

public class Solution {
    public int minDeletion(String s, int k) {
        // Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int distinctCount = freqMap.size();
        if (distinctCount <= k) return 0; // No deletion needed

        // Get frequencies sorted ascending (remove least frequent chars first)
        List<Integer> freqs = new ArrayList<>(freqMap.values());
        Collections.sort(freqs);

        int deletions = 0;
        int removeCount = distinctCount - k;

        for (int i = 0; i < removeCount; i++) {
            deletions += freqs.get(i); // delete all occurrences of the least frequent characters
        }

        return deletions;
    }

    // Test
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aabbccddeeffg";
        int k = 3;
        System.out.println("Minimum deletions: " + sol.minDeletion(s, k));  // Example output
    }
}
