import java.util.ArrayList;

public class apr12 {
    public static void main(String[] args) {
        System.out.println(prime(147));
        primeRange(40);
        int n = 40;
        boolean [] primes = new boolean[n+1];
        seive(n,primes);
        System.out.println();
        System.out.printf("%.3f",sqrt(40,3));
        System.out.println(Newtonrasph(40));
        factorsbf(20);
        System.out.println();
        factorsbetter(20);
        System.out.println();
        factorsbetterlist(20);
    }
    static void primeRange(int n){
        int i = 0;
        while(i<=n){
            if(prime(i)){
                System.out.print(i + " ");
            }
            i++;
        }
    }
    static boolean prime(int n){
        boolean isprime = true;
        if (n<=1) {
            isprime = false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime = false;
            }
        }
        return isprime;
    }
    static void seive(int n , boolean[] primes){
        for(int i = 2 ;i*i<=n;i++){
            // asssuming that false in the boolean array is a prime number 
            if (!primes[i]) {
                for(int j = i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if (!primes[i]) {
                System.out.print(i+" ");
            }
        }
    }
    static double sqrt(int n,int p){
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        // i got this is loop  wrong 
        // while(start*start !=n){
        //     if(start*start <n){
        //         start +=0.1;
        //     }else{
        //         start-=0.1;
        //     }
        double root = end;
        double inc = 0.1;
        for (int i = 0; i<p; i++) {
            while(root*root<=n){
                root+=inc;
            }
            root -=inc;
            inc /=10;
        }

        return root;
    }
    static double Newtonrasph(int n){
        double  x = n;
        double root;
        while(true){
            root = 0.5*(x+(x/n));
            if (Math.abs(x-root)<1) {
                    break;
                }
            x = root ;
        }
        return root ;
    }
    static void factorsbf(int n){
        int i = 1;
        while(i<=n){
            if(n%i==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
    static void factorsbetter(int n){
        int i = 1;
        while(i*i<=n){
            if(n%i==0){
                if(i == (n/i)){
                    System.out.print(i+" ");
                }else{
                System.out.print(i + " " + n/i + " ");
                }
            }
            i++;
        }
    }
        static void factorsbetterlist(int n){
            ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while(i*i<=n){
            if(n%i==0){
                if(i == (n/i)){
                    System.out.print(i+" ");
                }else{
                System.out.print(i + " ");
                list.add(n/i);
                }
            }
            i++;
        }
        for (int j = list.size()-1; j >=0; j--) {
            System.out.print(list.get(j)+ " ");
        }
    }
}
