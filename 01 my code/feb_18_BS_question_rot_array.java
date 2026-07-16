public class feb_18_BS_question_rot_array {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        System.out.println(search(array, 0));
    }
    static int search(int[] nums,int target){
        int pivot = findpivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length-1, target);
        }
        if (target == nums[pivot]) {
            return findpivot(nums);
        }
        else if(target > nums[0]) {
            return binarySearch(nums, 0, pivot-1, target);
        }
        else{
            return binarySearch(nums, pivot+1, nums.length-1, target);
        }
    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            // if any chance mid = end then mid +1 will provide a out of bounds so add the condition mid<end
            if (mid < end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            else if (arr[start] >= arr[mid]) {
                end = mid -1;
            }
            else if (arr[start] <arr[mid]) {
                // if the pivot was mid it would have got caught in the above code 
                start = mid +1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int start,int end,int target){
        while (start<=end) {
            int mid = start + (end -start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            else if (target > arr[mid]) {
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
