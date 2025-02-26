class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
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
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{};
    }
    void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}