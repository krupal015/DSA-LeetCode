class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // 1. Find the first index 'i' from the end where nums[i] < nums[i + 1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // 2. If such an index exists, find the element just larger than nums[i] to swap
        if (i >= 0) {
            int j = n - 1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // 3. Reverse the elements after index i
        reverse(nums, i + 1, n - 1);
    }

     private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
     private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
     }
}

