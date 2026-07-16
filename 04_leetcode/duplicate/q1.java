import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        
    }
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                // delete the element at i index 
               remove(nums, i); 
            }
        }

        Arrays.sort(nums);
        return count;

    }
    static int[] remove(int[]nums,int index){
        int [] arr = new int[nums.length-1];
        for (int i =0, j=0; i < arr.length; i++) {
            if (i!=index) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }
}
