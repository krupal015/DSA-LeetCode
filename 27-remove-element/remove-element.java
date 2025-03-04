class Solution {
    public int removeElement(int[] nums, int val) {
         int k = 0;  
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Move the element to the front of the array
                k++;  // Increment k
            }
        }
        
        return k; 
    }
}