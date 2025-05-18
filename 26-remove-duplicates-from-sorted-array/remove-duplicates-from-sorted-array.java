class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for(int i=1;i<nums.length;i++){ //we will start from 1 because first element of array is always unique
        if(nums[i] != nums[k-1]){
            nums[k] = nums[i];
            k++;
        }
        }
        return k;
    }
}