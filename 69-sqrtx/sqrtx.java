class Solution {
    public int mySqrt(int x) {
          if (x < 2) {
            return x;
        }

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // To prevent overflow, compare using long
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;       // store possible answer
                left = mid + 1;  // move to right half
            } else {
                right = mid - 1; // move to left half
            }
        }

        return ans;
    }
}