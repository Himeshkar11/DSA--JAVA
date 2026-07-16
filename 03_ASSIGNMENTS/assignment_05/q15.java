public class q15 {
    
    public int findNumbers(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];  // copy value
            int count = 0;

            while (temp > 0) {
                temp /= 10;
                count++;
            }

            if (count % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}

