public class q3 {
    public static void main(String[] args) {
        
    }
    static int[] RunningSum(int[]nums){
        int sum = nums[0];
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum +=nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
