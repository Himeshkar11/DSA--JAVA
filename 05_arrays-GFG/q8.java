import java.lang.reflect.Array;
import java.util.ArrayList;

public class q8 {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> answer(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i<arr.length) {
            ans.add(arr[i]);
            i = i+2;
        }
        if (arr.length==0) {
            return null;
        }
        else{
            return ans;
        }
    }
}
