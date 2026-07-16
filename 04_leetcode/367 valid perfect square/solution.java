class Solution {
    public boolean isPerfectSquare(int num) {
        if (number(num) !=-1) {
            return true;
        }else{
            return false;
        }
    }
    static long number(int num){
        long start = 0;
        long  end = num;
        while(start < end){
            long mid = start +(end-start)/2;
            long sq = mid*mid;
            if (sq==num) {
                return mid;
            }
            if (sq<num) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    
}