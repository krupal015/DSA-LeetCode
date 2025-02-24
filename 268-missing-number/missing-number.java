class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
         while (i < nums.length) {
            int target = nums[i] ;
            if(nums[i] <nums.length && nums[i] != nums[target]){
                swap(nums,i,target);
            }else{
                i++;
            }
         }
         for(int target = 0;target < nums.length;target ++){
            if(nums[target] != target){
                return target;
            }
         }
         return nums.length;
    }

   public void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}