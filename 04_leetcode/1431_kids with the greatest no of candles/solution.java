import java.util.ArrayList;
import java.util.List;

public class solution{
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> answer  = new ArrayList<>();
        // finding the max using the loop 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if(candies[j] + extraCandies >= max){
                answer.add(true);
            }
            else{
                answer.add(false);
            }
        }
        return answer;
        
    }
}