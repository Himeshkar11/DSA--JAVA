public class q4 {
    public static void main(String[] args) {
        
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i = 0;
        while(i<n) {
            ans[i] = nums[i];
            ans[i+1] = nums[n-1+i];
            i+=2;
        }
        return nums;
    }
}
