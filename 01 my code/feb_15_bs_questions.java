class Solution {
    public int[] searchRange(int[] nums, int target) {
    return new int[] {searchRange1(nums, target),searchRange2(nums, target)};
        
    }
    static int searchRange1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int n = -1; // for the not exisiting case 
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target > nums[mid]) {
                start = mid +1;
            }
            else if (target < nums[mid]) {
                end = mid-1;
            }
            else{
                ans = mid;
                end = mid -1;
            }
    }
    return ans ;
}
    static int searchRange2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int n = -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target > nums[mid]) {
                start = mid +1;
            }
            else if (target < nums[mid]) {
                end = mid-1;
            }
            else{
                mid = n;
                start = mid +1;
            }
    }
    return n;
}
}