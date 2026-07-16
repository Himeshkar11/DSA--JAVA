import java.util.Arrays;
import java.util.Scanner;

public class feb_7_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // arr[0] = 45;
        // arr[1] = 36;
        // arr[2] = 78;
        // arr[3] = 96;
        // arr[4] = 78;
        // inputing the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // printing the array 

        // can click ctrl and . and convert into enhanced for 
        System.out.println("the array is");
        for (int element : arr) {
            System.out.println(element);
        }

        System.out.println(arr[2]);
        // tostring method 
        System.out.println(Arrays.toString(arr));
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
    }
    System.out.println(Arrays.toString(str));
    changeName(str);
    System.out.println(Arrays.toString(str));

    int[][] twod_arr = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
    };
    // int[][] var_arr = new int[3][];
    int[][] var_arr = {
        {1,2,3},
        {4,5},
        {6,7,8,9},
    };

    int[][] ar = new int[3][3];
    for (int row = 0; row < ar.length; row++) {
        for (int column = 0; column < ar[row].length; column++) {
            ar[row][column] = sc.nextInt();
        }
    }
        for (int row = 0; row < ar.length; row++) {
        for (int column = 0; column < ar[row].length; column++) {
             System.out.print(ar[row][column]);
        }
        System.out.println();
    }
    // printing using Arrays.tostring()
    for (int i = 0; i < ar.length; i++) {
        System.out.println(Arrays.toString(ar[i]));
    }
    // using enhanced for loop 
    for (int[] element : ar) {
        for (int element2 : element) {
            System.out.print( element2);
        }
        System.out.println();
    }
    }

    static void changeName(String[] arr){
     // changes the value of first element into my name  

        arr[0] = "Himesh";
    }



}
