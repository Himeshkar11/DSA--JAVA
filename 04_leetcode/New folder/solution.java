import java.util.Arrays;

public class solution{
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.out.println(Arrays.toString(ans(arr, 3)));
    }
    static int[] binarySearch(int[][] arr,int row,int start,int end,int target){
        while(start <=end){
            int mid = start + (end-start)/2;
            if (arr[row][mid]==target) {
                return new int[] { row,mid};
            }
            if (arr[row][mid]<target) {
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] ans (int[][] arr,int target){
        int Rstart = 0;
        int Rend = arr.length-1;
        while (Rstart <=Rend) {
            int midR = Rstart+ (Rend-Rstart)/2;
            // if (arr[row].length==1) {
            //    while(Rstart <= Rend){
            //     if (arr[midR][arr[0].length-1] == target) {
            //         return new int[] {midR,arr.length-1};
            //     }
            //     if (arr[midR][arr[0].length-1] >  target && arr[midR][arr[0].length-1] >0 ) {
            //         Rend = midR -1;
            //     }
            //     else{
            //         Rstart = midR +1;
            //     }
            //    }
            // }
            if (arr[midR][0] <= target && arr[midR][arr[0].length-1] >= target) {
                return binarySearch(arr,midR,0,arr[0].length-1,target);
            }
            else if (arr[midR][arr[0].length-1]<target) {
                Rstart = midR +1;
            }
            else{
                Rend = midR -1;
            }
        }
        return new int[] {-1,-1};
    }
}