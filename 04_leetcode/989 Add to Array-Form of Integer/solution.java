import java.lang.reflect.Array;
import java.util.ArrayList;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
      int i = 0;
      int value = 0;
      while (i<num.length) {
        value = value*10;
        value += num[i];
        i++;
      } 
      int ans = value + k;
      while(ans>0){
        answer.addFirst(ans%10);;
        ans = ans/10;
      } 
      return answer;
    }
}