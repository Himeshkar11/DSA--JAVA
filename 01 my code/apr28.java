import java.util.Arrays;

public class apr28 {
    public static void main(String[] args) {
        int [] nums  = {5,4,3,2,1};
        quicksort(nums, 0, nums.length-1);
        System.out.println(4);
        System.out.println(Arrays.toString(nums));
    }
    static void quicksort(int [] nums,int low,int high){
        if (low>=high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s +(e-s)/2;
        int pivot = nums[mid];
        while(s<=e){
        // this is the reason if the array is already sorted then it will not swap
        while (nums[s] <pivot) {
            s++;
        } 
        while (nums[e] > pivot) {
            e--;
        }
        if (s<=e) {
        // both conditions failed so swap here 
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
        s++;
        e--;
        }
    }
    // now ny recursion give me answer 
    quicksort(nums, low, e);
    quicksort(nums, s, high);

 

    }
}
