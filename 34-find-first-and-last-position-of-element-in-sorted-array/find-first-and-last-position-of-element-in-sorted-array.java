class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first =-1;
        int last =-1;
        int fin= -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                first = i;
                break;
            }
        }

         for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                fin = i;
            }
            last =fin;
        }
        return new int[]{first,last};
    }

}