public class feb_16_BS_questions {
    public static void main(String[] args) {
        
    }
    // find the element in the infinte sorted array 
    // ie we dont know the size of the array 
    static int ans(int[]arr, int target){
        int start = 0;
        int end = 1;
        // let`s start with a window of size 2 at start
        while(target > arr[end]){
            int news = end+1;
            end = end +(end-start + 1)*2;
            start = news;
        }
        return bs(arr, target, start, end);
    }
    static int bs(int[]arr, int target,int start,int end ){
        // assume the start to be from 0
        // and lets assume the length of the chunks is k which is 6 say 
        // int k = 6;
       
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid -1;
            }
            else{
              return mid;
            }
        }
        return start;
    }
    static int find_end(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            end = end + (end-start+1)*2;
        }
        return end;
    }
    static int moutain_array(int [] arr){
        int start = 0;
        int end = arr.length-1;
            while (start!=end) {
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
