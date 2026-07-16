import java.util.ArrayList;
// my try 
public class q11{
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> answer = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum+=gain[i];
            answer.add(sum);
        }
        int max = answer.get(0);
        for (int i = 0; i < answer.size(); i++) {
            if(answer.get(i) > max){
                max= answer.get(i);
            }

        }
        if(max<0){
            return 0;
        }else{
            return max;
        }
        
    }
}

// optimized solution 

// class Solution {
//     public int largestAltitude(int[] gain) {
//         int sum = 0;
//         int max = 0;
//         for (int i = 0; i < gain.length; i++) {
//             sum+=gain[i];
//             max = Math.max(sum,max);
//         }
//         return max;
//     }
// }