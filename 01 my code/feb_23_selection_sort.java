import java.util.Arrays;

public class feb_23_selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            // check the greatest element and swap with right value 
            int last = arr.length-i-1; // the right index value 
            int max = getMax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int  getMax(int[]arr,int start,int end){
        int max = start;
        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
