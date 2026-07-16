import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int [] a = {484,595,9595,959,5985};
        int [] b ={959,5985};
        System.out.println(array_subset(a, b));

    }
    // array subset
    static boolean array_subset(int[] a ,int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i =0;
        boolean found = false;
        for (int j = 0; j < b.length; j++) {
            if(b[i]==a[j]){
                i++;
                found = true;
                break;
            }
        if(!found){
            return false;
        }
        }
        return true;
}
    }
            