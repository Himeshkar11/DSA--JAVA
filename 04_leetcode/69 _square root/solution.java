class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        int ans = 0;
        while(start <=end){
            long mid = start + (end-start)/2;
            if (mid*mid <= x ) {
                ans =(int) mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}