class Solution {
    public void moveZeroes(int[] nums) {
        
        if (nums.length == 1) {
            return;
        }
        for (int i = 0, k =1; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (nums[k] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[k+1];
                    nums[k+1] = temp;
                }
                else{
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                }
            k++;
            }
                
        if (k == nums.length) {
                break;
            }  
        }
    }

}