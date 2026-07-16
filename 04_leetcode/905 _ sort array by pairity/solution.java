// class Solution {
//     public int[] sortArrayByParity(int[] arr) {
//         boolean swapped;
//         // cheking the i : 0 to n-1 ie passes
//         for (int i = 0; i < arr.length; i++) {
//             swapped = false;
//             // checking for j : 1 to n-i ie each step
//             for (int j = 1; j < arr.length - i; j++) {
//                 // check the condition to swap 
//                 if (arr[j]%2!=0) {
//                     // swap 
//                     int temp = arr[j];
//                     arr[j] = arr[j-1];
//                     arr[j-1] = temp;
//                     swapped = true;
//                 }
//             }
//             if(!swapped){
//                 break;
//             }
//         }
//     }
// }
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;
            }
            else if (nums[i]%2 == 1) {
                j--;
            }
            else{
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }
}