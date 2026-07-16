import java.util.Arrays;
// optimization required 
public class q12 {
    public static void main(String[] args) {
       int [] arr = {-1, -2, -3, 4, 5, 6, 7};
       rot(arr);
       System.out.println(Arrays.toString(arr));
        
    }
    void leftRotate(int arr[], int d) {
        for (int i = 0; i <= d; i++) {
            rot(arr);
        }
        
    }
    static void rot(int[] arr){
        int n = arr.length -1;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

}
    

