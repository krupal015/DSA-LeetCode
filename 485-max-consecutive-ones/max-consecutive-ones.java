class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max = maximum(max,count);
            }else{
                count=0;
            }
        }
        return max;
    }

    int maximum(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}