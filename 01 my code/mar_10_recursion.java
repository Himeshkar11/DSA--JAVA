public class mar_10_recursion {
    public static void main(String[] args) {
        System.out.println(fibo(4));
        int[] arr ={1,2,3,4,5};
        int target = 2;
        int answer = binary_search(arr, target, 0, arr.length-1);
        System.out.println(answer);
    }
    static int fibo(int n){
        if (n==0) {
            return 0;
        }
        if (n ==1) {
            return 1;
        }
        else{
            return  fibo(n-1) + fibo(n-2);
        }
    }
    static int binary_search(int[]arr,int target,int start,int end ){
        if (start > end) {
            return -1;
        }
        int mid = start +(end - start)/2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binary_search(arr, target,mid+1, end);
        }
        else{
            return binary_search(arr, target, start, mid-1);
        }
    }
}
