class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>();  
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) +1);
            }else{
                 map.put(nums[i], 1); 
            }
        }

        for(int i=0;i<=n;i++){
            bucket.add(new ArrayList<>());
        }
        for(int no: map.keySet()){
            bucket.get(map.get(no)).add(no);
        }

        int[] res = new int[k];
        int idx =0;
        for(int i= n;i>0;i--){
            for( int num:bucket.get(i)){
                res[idx++]=num;
                if(idx == k) return res;
            }
        }

       return res;
    }
}