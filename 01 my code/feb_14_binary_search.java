public class feb_14_binary_search {
    public static void main(String[] args) {
        int[] arr ={-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int [] arrdes = {90 , 75 , 18, 12 , 6, 4, 3, 1};
        int ans = orderaconisticbs(arr, 22);
        int a = orderaconisticbs(arrdes, 3);
        System.out.println(ans);
        System.out.println(a);
    }
    // return the index and return -1 if not exists 
    static int binarysearch(int[]arr,int target){
        int start = 0;
        int end = arr.length -1;
        // there is a problem that it might be possible that start + end excceds the range of int in java
         while (start<=end) {
        // (int mid = start + end /2) no not feasible for our calcauations now 
        int mid = start + (end-start)/2;
        
        if (target < arr[mid]) {
            end = mid-1;
        }
        else if(target > arr[mid]){
            start = mid +1;
        }
        else{
            // answer found 
            return mid;
        }
        }
    return -1;
    }
    static int orderaconisticbs(int[]arr,int target){
        int start = 0;
        int end = arr.length -1;
        boolean order = arr[start]<arr[end];
            while (start<=end) {
            // (int mid = start + end /2) no not feasible for our calcauations now 
                int mid = start + (end-start)/2;
                if (target == arr[mid]) {
                    return mid;
                }
                if (order) {
                    if (target<arr[mid]) {
                        end = mid -1;
                    }
                    else {
                        start = mid+1;
                    }
                }
                else{
                    if (target>arr[mid]) {
                        end = mid -1;
                    }
                    else {
                        start = mid+1;
                    }
                }
            }

        return -1;
    }
}
