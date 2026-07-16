import java.util.Arrays;

public class feb_22_algortihms_BUBBLE {
    public static void main(String[] args) {
        // complete the moody`s algorithm and bubble sort today
        int[] arr = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(pairsumBF(arr, 9)));
        System.out.println(Arrays.toString(pairsumOPM(arr, 9)));
        // answer-> [0,1]
        int[] nums = { 2, 1, 1, 2, 1, 1, 2 };
        System.out.println(MajorityElement(nums));
        System.out.println(MajorityElementBetter(nums));
        System.out.println(MajorityElementBest(nums));
        int[] vari = {1,2,3,4};
        System.out.println(moore_variation(vari)); 
        int[] bubblesort = {5,4,3,2,1};
        System.out.println(Arrays.toString(bubblesort));
        bubble(bubblesort);
        System.out.println(Arrays.toString(bubblesort));
    }

    static int[] pairsumBF(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) { // first fixing an element
            for (int j = i + 1; j < arr.length; j++) {
                // here we will get all the pairs
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null; // since int the question they mentioned answer will defiently exist
    }

    static int[] pairsumOPM(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        // two pointer approach
        while (i < j) {
            int psum = arr[i] + arr[j];
            if (psum > target) {
                // this i shappening due to the last element
                j--;
            } else if (psum < target) {
                // this is happening due to the first element
                i++;
            } else {
                return new int[] { i, j };
            }
        }
        // since it is said that we will always have the answer
        return null;
    }

    static int MajorityElement(int[] arr) {
        for (int val : arr) {
            int count = 0;
            for (int element : arr) {
                if (element == val) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return val;
            }
        }
        return -1;
    }

    static int MajorityElementBetter(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
                ans = arr[i];
            }
            if (count > arr.length / 2) {
                return ans;
            }
        }
        return ans;
    }

    static int MajorityElementBest(int[]nums){
        // moore`s voting algorithm
        int votes = 0;
        int candidate = 0;
        // since we took the candidate as 0 we will start trancseversing the array from 1 
        // if you want to i from 0 then put cnadidate = -1 
        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                // selecting the appropriate candidate
                candidate = nums[i];
                votes = 1;
            }
            else if (candidate == nums[i]) {
                // ie the next element is equal to the next one 
                votes++;
            }
            else{
                votes--;
            }
        }
        return candidate;
        // no need to even apply step two 
    }

    static int moore_variation(int[] nums){
        // moore`s voting algorithm:
        // step 1 find the major element :- which will be candidate by the end 
        int votes = 0;
        int candidate = 0;
        // since we took the candidate as 0 we will start trancseversing the array from 1 
        // if you want to i from 0 then put cnadidate = -1 
        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                // selecting the appropriate candidate
                candidate = nums[i];
                votes = 1;
            }
            else if (candidate == nums[i]) {
                // ie the next element is equal to the next one 
                votes++;
            }
            else{
                votes--;
            }
        }
        // the majority element is the candidate now 
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            }else{
                count--;
            }
        }
        if (count > nums.length/2) {
            return candidate;
        }else{
            return -1;
        }
    }
    static void bubble(int[]arr){
        boolean swapped;
        // cheking the i : 0 to n-1 ie passes
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // checking for j : 1 to n-i ie each step
            for (int j = 1; j < arr.length - i; j++) {
                // check the condition to swap 
                if (arr[j]<arr[j-1]) {
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}
