public class feb_13_binary_search {
    public static void main(String[] args) {
    int [] arr = {5,7,17,26,45,86,99};
    int target = 17;
    int answer =binarysearch(arr,target);
    System.out.println(answer);
    }
    static int binarysearch(int[]arr,int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            if (arr[mid]<target) {
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    
}
