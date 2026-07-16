public class apr21 {

    public static void main(String[] args) {
        fun(5);
        fun2(5);
        fun3(5);
        System.out.println(fact(5));
        System.out.println(sum(5));
    }
    static void fun(int n){
        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        fun(n-1);

    }
    static void fun2(int n){
        if (n==1) {
            System.out.println(5);
            return;
        }
        System.out.println(5-n+1);
        fun2(n-1);
    }
    static void fun3(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        fun3(n-1);
        System.out.println(n);
    }
    static int fact(int n){
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return n + sum(n-1);
    }
}