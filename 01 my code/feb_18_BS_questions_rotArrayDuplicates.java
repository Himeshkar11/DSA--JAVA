public class feb_18_BS_questions_rotArrayDuplicates {
        public static void main(String[] args) {
        int[] array = {2,9,2,2,2};
        System.out.println(search(array, 2));
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
            // if element at start = mid = end 
            else if (arr[mid] == arr[start] && arr[mid] == arr[end]){} {
                // trim the array 
                // note :- but what if the start and end are pivots 
                //checking if start is pivot 
                if (arr[start] > arr[start +1]) {
                    return start;
                }
                start ++;
                // checking if end is pivot 
                if (arr[end]> arr[end-1]) {
                    return end;
                }
                end --;
            }
            if(arr[start]< arr[mid]|| arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid +1;
            }else{
                end = mid -1;
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
