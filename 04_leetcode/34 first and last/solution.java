// class Solution {
//     public static void main(String[] args) {
        
//     }
//    static int[] searchRange(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length-1;
//         while (start <= end) {
//             int mid = start + (end-start)/2;
//             if (target > nums[mid]) {
//                 start = mid +1;
//             }
//             else if (target < nums[mid]) {
//                 end = mid-1;
//             }
//             else{
//                 return new int[] {start,mid};
//             }
//         }
//          return new int[] {-1,-1};

//     }
// }
public class solution {

    public static void main(String[] args) {
        
    }
        public int[] searchRange(int[] nums, int target) {
        return new int[] {searchRange1(nums, target),searchRange2(nums, target)};
    }
    static int searchRange1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target > nums[mid]) {
                start = mid +1;
            }
            else if (target < nums[mid]) {
                end = mid-1;
            }
            else{
                end = mid -1;
            }
    }
    return start ;
}
    static int searchRange2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target > nums[mid]) {
                start = mid +1;
            }
            else if (target < nums[mid]) {
                end = mid-1;
            }
            else{
                start = mid +1;
            }
    }
    return end ;
}
}