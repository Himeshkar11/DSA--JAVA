public class apr11 {
    public static void main(String[] args) {
        System.out.println(findpower(5, 10));
        System.out.println(findnoofsetbit(10));
        System.out.println(setbits(7));
        // this converts the integer into its own binary coded string 
        System.out.println(Integer.toBinaryString(10));
        System.out.println(rangexor(3, 9));
    }
    static int findpower(int base,int power){
        int ans = 1;
        while(power>0){
            if((power&1)==1){
                ans *=base;
            }
            base*=base;
            power = power>>1;
        }
        return ans;
    }
    static int findnoofsetbit(int n){
        int count = 0;
        while(n>0){
            if ((n&1) ==1) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    static int setbits(int n){
        int count = 0;
        while (n>0) {
            count++;
            n = n - ((n & -n));
        }
        return count;
    }
    static int rangexor(int a , int b){
        // range of xor of a,b 
        return xor(b) ^ xor(a-1);
    }
    static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        if(a%4==3){
            return 0;
        }
        return 0;
    }
}
