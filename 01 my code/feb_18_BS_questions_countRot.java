public class feb_18_BS_questions_countRot {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        System.out.println(countRot(array));
    }
    static int  countRot(int[]arr){
        int pivot = findpivot(arr);
        int count = 0;
        if (pivot == -1) {
            return 0;
        }
        while (pivot>=0){
                count++;
                pivot--;
                
        }
        return count;

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
