class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      {
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end-start) / 2;

            if(arr[mid] < arr[mid + 1]){
                 // you are in increasing part of the array
                    start = mid + 1;
            }else if (arr[mid] > arr[mid+1]){
                // you are in decreasing part of the array
                // it maybe ans ,but look at left
                end = mid;
            } 
        }
        // at the end , start == end and pointing to the largest number in the array
        // start and end will always try to find the maximum element in the above 2 checks
        // at every point of time for start and end they will have the maximum element
        // and at the end only one item is remaining , hence cuz above line that is the best possible ans available
        return start; //or return end both are equal
    }
    }
}