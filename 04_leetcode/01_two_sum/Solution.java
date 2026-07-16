import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int [] arr ={3,2,4};
        // twoSum(arr,6);
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i<= nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    int [] ans = {i,j};
                    return ans;
                }

            }

        }
        int [] ans = null;
        return ans;
    }
}