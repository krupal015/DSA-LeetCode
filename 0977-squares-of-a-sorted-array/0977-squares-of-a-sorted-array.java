class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length ;
        int j = 0;
        int k = n-1;
         int[] result = new int[n]; 

        for(int i=n-1 ; i>=0;i--){
            if( nums[j] * nums[j] >  nums[k] * nums[k]){
                 result[i] =  nums[j] * nums[j];
                j++;
            }
            else{
                  result[i] =  nums[k] * nums[k];
                k--;
            }
           
        }
      
    return result;
    }
}