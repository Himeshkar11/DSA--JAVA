import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    ArrayList<Integer> answer = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int index = nums[i]-1;
            if (nums[i]==nums[index]) {
                i++;
            }else{
                // swap//
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                answer.add(nums[j]);
            }
        }
        return answer;
    }
}