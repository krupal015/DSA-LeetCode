class Solution {
    public int findDuplicate(int[] nums) {
     int i =0;
     while(i<nums.length){
        int target = nums[i]-1;
        if(nums[i] != nums[target]){
            swap(nums,i,target);
        }else{
            i++;
        }
     }
     for(int j=0;j<nums.length;j++){
        if(nums[j] != j+1){
            return nums[j];
        }
     }
     return nums.length;
    }


void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
}
 }