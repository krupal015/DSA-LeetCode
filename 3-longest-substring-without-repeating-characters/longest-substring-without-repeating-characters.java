class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0;  // Left pointer of the sliding window
        int maxLen = 0; // To store the maximum length of substring found

        // Traverse through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If we find a duplicate character, move the left pointer
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }
            
            // Update the last seen index of the current character
            charIndexMap.put(currentChar, right);
            
            // Calculate the current window length and update the max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}