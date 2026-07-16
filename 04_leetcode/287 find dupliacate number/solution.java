class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            int index = nums[i]-1;
            if (nums[i] == nums[index]) {
                i++;
            }
            else  {
                // swap with arr[i] and arr[index]
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            int index = nums[j] -1;
            if (j!=index) {
                return nums[j];
            }
        }
        return 0;
    }
}