class Solution {
    public int romanToInt(String s) {
          java.util.Map<Character, Integer> romanMap = new java.util.HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int total = 0;
        int length = s.length();
        
        // Iterate through the string, checking current and next characters
        for (int i = 0; i < length; i++) {
            // If the current numeral is smaller than the next, subtract it
            if (i < length - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                total -= romanMap.get(s.charAt(i));
            } else {
                // Otherwise, add the value
                total += romanMap.get(s.charAt(i));
            }
        }
        
        return total;
    }
}