class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int target = nums[i]-1;
            if(nums[i] != nums[target]){
                swap(nums,i,target);
            }else{
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for(int target=0;target<nums.length;target++){
            if(nums[target]!= target+1){
                ans.add(target+1);
            }
        }
        return ans;
    }
    void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}