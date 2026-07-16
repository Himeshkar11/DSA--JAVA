import java.util.Arrays;

public class apr27 {
    public static void main(String[] args) {
        int [] arr = {8,3,4,12,5,16};
        System.out.println(Arrays.toString(MergeSort(arr)));
        MergeSortInplace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] MergeSort(int [] arr){
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        int [] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left , right);
    }
    static int [] merge(int[] left,int[] right){
        int [] mix = new int[left.length + right.length];
        int i = 0;
        int j =0;
        int k =0;
        while (i<left.length && j<right.length) {
            if (left[i]<right[j]) {
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            mix[k] = right[j];
            j++;  
            k++;        
        }
        return mix;
    }
    static void MergeSortInplace(int [] arr, int s,int e){
        if (s>=e) {
            return;
        }
        int mid = (s+e)/2;
        MergeSortInplace(arr,s,mid);
        MergeSortInplace(arr, mid+1, e);
        MergeInplace(arr,s,mid,e);
    }
    static void MergeInplace(int []arr,int s,int mid,int e){
        int [] mix = new int[e-s+1];
        int i = s;
        int j =mid+1;
        int k =0;
        while (i<=mid && j<=e) {
            if (arr[i]<arr[j]) {
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j<=e) {
            mix[k] = arr[j];
            j++;  
            k++;        
        }
        for(int h=0;h<mix.length;h++){
            arr[s+h] = mix[h];
        }
    }
}
