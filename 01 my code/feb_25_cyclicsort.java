import java.util.Arrays;

public class feb_25_cyclicsort{
    public static void main (String[] args){
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(arr));
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic_sort(int[]arr){
        int i = 0;
        while (i<arr.length) {
            int index = arr[i] -1;
            if (arr[i] == arr[index]) {
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}