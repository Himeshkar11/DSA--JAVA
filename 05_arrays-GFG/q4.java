import java.util.ArrayList;
import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
        
    }
    class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> ans= new ArrayList<Integer>();
            ans.add(arr[0]);
            ans.add(arr[arr.length-1]);
            return ans;
    }
}
}
