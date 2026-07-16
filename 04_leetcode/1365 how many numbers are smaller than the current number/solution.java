public class solution{
        public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = nums.length-1; j >0; j--) {
                if (nums[j]<nums[i]) {
                   count++; 
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}