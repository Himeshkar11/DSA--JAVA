class Solution {
    public int specialArray(int[] nums) {
        // finding x 
        int i  = 0;
        int j = nums.length-1;
        int x = nums.length;
        while(i<nums.length){
            if(nums[i] ==nums[j]){
                x --;
             
            }
            j--;
        }
    }
}