import java.util.ArrayList;
import java.util.Arrays;

public class feb_12_linear_search_p2 {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12},
        };
        int target = 6;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(sum(arr));
        System.out.println(max(arr));
        }
    static int[] search(int[][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int sum(int[][]arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    static int max(int[][]arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        } 
        return max;
    }
    public int findNumbers(int[] nums) {
ArrayList<Integer> noof = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while(nums[i]>0){
                count++;
                nums[i]=nums[i]/10;
            }
            noof.add(count);
        }
        int ans = 0;
        for (Integer integer : noof) {
            if (integer %2 ==0) {
                ans++;
            }
        }
        return ans;
    }

    
    public int maximumWealth(int[][] accounts) {
ArrayList<Integer> all = new ArrayList<>();
        for (int[] ele : accounts) {
            all.add(sum(ele));
        }
        int max = Integer.MIN_VALUE;
        for (Integer integer : all) {
            if (integer>max) {
                max = integer;
            }
        }
        return max;
    }
    static int sum(int[]arr){
        int sum =0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

}
