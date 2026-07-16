class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        // cyclic sort
        int j = 0;
        while (j<nums.length) {
            int index = nums[j] -1;
            if (nums[j] == nums[index]) {
                j++;
            }else{
                // swap 
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
            }
        }
        // searching 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1) {
                answer[0]= nums[i];
                answer[1] = i+1;
            }
        }
        return answer;
    }
}