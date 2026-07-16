public class question {
    public static void main(String[] args) {
        System.out.println(mirrorFrequency("ab1z9"));
        int [] arr = {1,2,2};
        System.out.println(minIncrease(arr));
    }

       static int minIncrease(int[] nums) {
    int n = nums.length;

    // Case 1: peaks at odd indices
    int cost1 = 0;
    for (int i = 1; i < n - 1; i += 2) {
        int needed = Math.max(nums[i - 1], nums[i + 1]) + 1 - nums[i];
        if (needed > 0) cost1 += needed;
    }

    // Case 2: peaks at even indices
    int cost2 = 0;
    for (int i = 2; i < n - 1; i += 2) {
        int needed = Math.max(nums[i - 1], nums[i + 1]) + 1 - nums[i];
        if (needed > 0) cost2 += needed;
    }

    return Math.min(cost1, cost2);
}
    
    static int mirrorFrequency(String s) {
        int i = 0;
        int j = s.length()-1;
        int answer = 0;
        int freq_c = 0;
        int freq_m = 0;
        while(i<s.length()&& j>=0){
            freq_c = 0;
            freq_m = 0;
            int x = (int)s.charAt(i);
            int y = (int)s.charAt(j);
            if(x<=9 && x >=0){
                freq_c++;
                if(y== (9-x)){
                    freq_m++;
                    i++;
                }else{
                    j--;
                }
                
            }
            else{
                freq_c++;
                if(y == (219-x)){
                    freq_m++;
                    i++;
                }else{
                    j--;
                }                
            }
           
        }
        answer += Math.abs(freq_c-freq_m);
        return answer;
    }
}

