// public class q8 {
//     public static void main(String[] args) {
        
//     }
//     public int[] createTargetArray(int[] nums, int[] index) {
//         int[] ans = new int[nums.length];
//         for (int i = 1; i < ans.length; i++) {
//             if (ans[index[i-1]] !=]) {
                
//             }
//         }
//     }
//     public static int[] insertAtIndex(int[] arr, int index, int value) {
//     int[] newArr = new int[arr.length + 1];

//     // copy elements before index
//     for (int i = 0; i < index; i++) {
//         newArr[i] = arr[i];
//     }

//     // insert new value
//     newArr[index] = value;

//     // shift remaining elements
//     for (int i = index; i < arr.length; i++) {
//         newArr[i + 1] = arr[i];
//     }

//     return newArr;
// }
// }
// but best approach using array list 

import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            ans.add(index[i],nums[i]);
        }
        int[] target = new int[ans.size()];
        for (int i = 0; i < target.length; i++) {
            target[i] = ans.get(i);
        }
        return target;
    }

}