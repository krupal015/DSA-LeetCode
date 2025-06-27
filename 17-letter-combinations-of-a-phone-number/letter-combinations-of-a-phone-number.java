class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> result = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
            return result;
        }

        // Mapping of digits to letters
        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        backtrack(result, digits, 0, new StringBuilder(), mapping);
        return result;
    }
    
    private void backtrack(List<String> result, String digits, int index, StringBuilder current, String[] mapping) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(result, digits, index + 1, current, mapping);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}