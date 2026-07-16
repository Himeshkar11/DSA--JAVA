public class solution{

    public static void main(String[] args) {
        
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int []arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            // if(i<n){
            //     arr[i] = nums[i];
            // }else{
            //     arr[i] = nums[i-n];
            // }
            // a better way exists 
            arr[i] = nums[i];
            arr[n+i] = nums[i];
        }
        return arr;
    }
}
