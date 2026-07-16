import java.util.Arrays;

public class q5 {
    
class Solution {
    public void rotate(int[] arr) {
int n = arr.length -1 ;
for (int j = 0; j < n; j++) {
    int temp = arr[j];
    arr[j] = arr[n];
    arr[n] = temp;
    }


}
    }
}

