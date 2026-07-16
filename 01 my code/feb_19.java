import java.lang.reflect.Array;
import java.util.Arrays;

public class feb_19 {
     
    public static void main(String[] args) {
     // searching in 2d array linear search 
     int [][] arr = {{18,9,12},
                    {36,-4,91},
                    {44,33,16}
                };  
    // System.out.println(Arrays.toString(search2D(arr, 6)));
    // binary search in 2d arrays 
         int [][] nums = {{10,20,30,40},
                    {15,25,35,45},
                    {28,29,37,45},
                    {33,34,38,50},
                };  
    System.out.println(Arrays.toString(search2DSorted(nums, 29
    )));

    }
    static int[] search2D(int[][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search2DSorted(int[][]arr,int target){
        int r = 0;
        int c = arr.length-1;
        while(r<=arr.length-1 && c >=0){
            if (arr[r][c]==target) {
                return new int[] {r,c};
            }
            else if (arr[r][c]>target) {
                c--;
            }
            else{
               r++;
            }
        }
        return new int[] {-1,-1}; 
    }
}