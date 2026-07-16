public class feb_21_algorithms_new {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        printSubArray(arr);
        System.out.println(maxSubArraySum(arr));
        System.out.println(minSubArraySum(arr));

    }
    static void printSubArray(int[]arr){
                for (int st = 0; st <= arr.length; st++) {
            for (int end = st ; end <= arr.length; end++) {
                for (int i = st; i < end; i++) {
                    System.out.print(arr[i]);
                }
                System.out.print("\t");
            }
           System.out.println(); 
        }
    }
    static int maxSubArraySum(int[]arr){
        int maxSum = 0;
        for (int st = 0; st < arr.length; st++) {
            int CurrentSum = 0;
            for (int end = st; end < arr.length; end++) {
                CurrentSum += arr[end];
                maxSum = Math.max(CurrentSum,maxSum);
            }
        }
        return maxSum;
    }
    static int minSubArraySum(int[]arr){
        int minSum = arr[0];
        for (int st = 0; st < arr.length; st++) {
            int CurrentSum = arr[0];
            for (int end = st; end < arr.length; end++) {
                CurrentSum += arr[end];
                minSum = Math.min(CurrentSum,minSum);
            }
        }
        return minSum;
    }
    static int Kadane_algorithm(int[]nums){
        int MaxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            CurrentSum +=nums[i];
            MaxSum = Math.max(MaxSum, CurrentSum);
            if (CurrentSum<0) {
                CurrentSum = 0;
            }
        }
        return MaxSum;
    }
}
