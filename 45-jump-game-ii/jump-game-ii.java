class Solution {
    public int jump(int[] nums) {
         int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // When we reach the end of the current jump range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // Early exit if we can already reach the end
                if (currentEnd >= nums.length - 1) break;
            }
        }

        return jumps;
    }
}