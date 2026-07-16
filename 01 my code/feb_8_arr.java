import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class feb_8_arr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int [][] arr = {
        //     {1,2,3,4},
        //     {5,6},
        //     {7,8,9}
        // };
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // ArrayList<Integer> list  = new ArrayList<>(10);
        // // list.add(69);
        // // list.add(13);
        // // list.add(12);
        // // list.add(13);        
        // // list.add(23);        
        // // list.add(278);        
        // // list.add(2745);        
        // // list.add(2);        
        // // list.add(244);        
        // // list.add(24424);        
        // // list.add(2442465);        
        // // list.add(244246578);        
        // // list.add(24424654);
        // // System.out.println(list.contains(2));
        // // // System.out.println(list.addAll(list));
        // // System.out.println(list.indexOf(2));
        // // System.out.println(list.lastIndexOf(list));
        // // System.out.println(list.removeFirst());
        // // System.out.println(list.set(0, 4)); 
        // // System.out.println(list.remove(2));    
        // for (int i = 0; i < 5; i++) {
        //     list.add(sc.nextInt());
        // }   
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(list.get(i));
        // }
        // ArrayList<ArrayList<Integer>> multi = new ArrayList<>(3);
        // // initialization 
        // for (int i = 0; i < 3; i++) {
        //     multi.add(new ArrayList<>());
        // }
        // // add elements
        // for (int i = 0; i < 3; i++) {
        //    for (int j = 0; j < 3; j++) {
        //     multi.get(i).add(sc.nextInt());
        //    } 

        // }
        // System.out.println(multi);

        // q1  Q1 : Swaping Values in an Array
        int[] arr = {1,3,23,9,18};
        System.out.println(Arrays.toString(arr));
        // create a swap method which take the aguments arr and 2 indices and swap their positions
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int []arr,int index1,int index2){
       int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;

    }
    // // q2  Q2 : Maximum Value of an Array
    // int[] arr = {1,3,23,9,18};
    // System.out.println(max_arr(arr));
    
    // }
    // static int max_arr(int[]arr){
    //     int max =0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i]>max){
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }
// Q3 reversing the array
int[] arr = {1,3,23,9,18};
rev_arr(arr);
System.out.println(Arrays.toString(arr));

}
static void rev_arr(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}

}
