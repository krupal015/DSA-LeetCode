class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();  
        int[] last = intervals[0];
        ans.add(last);
        for(int i=1;i<intervals.length;i++){
            int[] current= intervals[i];
            if(current[0] <= last[1] ){
                last[1] = Math.max(last[1],current[1]);
            }else{
                last=current; 
                ans.add(last);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}