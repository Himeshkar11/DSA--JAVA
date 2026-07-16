public class apr23 {
    public static void main(String[] args) {
        System.out.println(rev2(1234));
        System.out.println(palindrome(2112));
        System.out.println(findzero(401245002, 0));
    }
    static int rev2(int n){
        int digits = (int)Math.log10(n)+1;
        return calc(n,digits);
    }
    static int calc(int n,int digits){
        if (n%10 ==n) {
            return n;
        }
        int rem =n%10;
        return rem*(int)(Math.pow(10, digits-1)) + calc(n/10, digits-1);

    }
    static boolean palindrome(int n){
        return (n==rev2(n));
    }
    static int  findzero(int n,int count){
        if (n==0) {
            return count;
        }
        int rem = n%10;
        if (rem==0) {
            return findzero(n/10, count+1);
        }else{
            return findzero(n/10, count);
        }
    }

}
