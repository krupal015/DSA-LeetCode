class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the end (least significant digit)
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Set current digit to 0 if it's 9
            digits[i] = 0;
        }

        // If we are here, all digits were 9 (like 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1; // First digit is 1, rest are 0 by default
        return result; 
    }
}