class Solution {
    public int maxArea(int[] height) {
         int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate current area
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int currentArea = h * w;

            // Update max area if current is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}