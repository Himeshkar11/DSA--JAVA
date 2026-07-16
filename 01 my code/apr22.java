public class apr22 {
    public static void main(String[] args) {
        System.out.println(dsum(152));
        System.out.println(dpdt(152));
      rev1(152);
      System.out.println(sum);
    }
    static int dsum(int n){
        if (n%10==n) {
            return n;
        }
        int d = n%10;
        return dsum(n/10) + d;
        
    }
        static int dpdt(int n){
        if (n%10==n) {
            return n;
        }
        int d = n%10;
        return dpdt(n/10)*d;
        
    }
    static int sum =0;
    static void rev1(int n){
        if (n==0) {
            return ;
        }
        int rem = n%10;
        sum=sum*10+ rem;
        rev1(n/10);

    }
}
