public class feb_18_BS_questions_final {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            // by the end of the loop this will contain the max value of the array
            start = Math.max(start, nums[i]);
            // by the end this will have all the values of the sum of array 
            end += nums[i];
        }
        // run the binary search for the given range {start : end}
        while (start < end) {
            int mid = start + (end-start)/2;
            int sum = 0;
            int pieces = 0;
            for (int num : nums) {
                if (sum + num >mid) {
                    sum = num;
                    pieces++;
                }else{
                    sum +=num;
                }

            }
            if (pieces<k) {
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
}
