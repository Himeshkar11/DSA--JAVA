import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    static  int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<=right){
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // due to 1 indexing writing +1
                return new int []{left+1,right+1};
            }
            if (sum<target) {
                left++;
            }else{
                right--;
            }
        }


        return new int [] {-1,-1};
    }
}