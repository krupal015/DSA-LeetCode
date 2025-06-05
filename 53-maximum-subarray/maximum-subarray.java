class Solution {
    public int maxSubArray(int[] nums) {

         int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }

        return max;



        // int sum =nums[0];
        // int max = nums[0];
        // // int ansStart =-1;
        // // int ansEnd =-1;
        // for(int i =0;i<nums.length;i++){

        //      sum = sum +nums[i];

        //     //  if(sum < 0){
        //     //     sum =0;
        //     //  }

        //      if(sum>max){
        //         max =sum;
        //      }
        // }
        // return max;
    }
}