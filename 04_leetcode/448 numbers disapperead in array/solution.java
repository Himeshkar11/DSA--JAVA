import java.util.ArrayList;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<nums.length){
            int index = nums[i]-1;
            if (nums[i] == nums[index]) {
                i++;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1) {
                ans.add(j+1);
            }
        }
        return ans;
    }
}