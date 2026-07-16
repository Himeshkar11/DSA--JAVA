class Solution {
    public int[] sumZero(int n) {
        int[] answer = new int[n];
        int add = -n/2;
        int i = 0;
        while(add<=n/2){
            if (n%2!=0) {
                answer[i] = add;
                add+=1;
                i++;
            }else{
                if (add == 0) {
                    add++;
                }
                answer[i] = add;
                add+=1;
                i++;
            }     
        }
        return answer;
    }
}