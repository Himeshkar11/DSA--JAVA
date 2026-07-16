public class mar_19_bits {
    public static void main(String[] args) {
        System.out.println(magicno(6));
        System.out.println(digit(400));
        System.out.println(digitformula(400,2));
        System.out.println(twopowern(64));
        System.out.println(twopowernBetter(64));
    }
            static int OddSinglenumber(int [] arr){
            int result = 0;
            // going though all 32 bits 
            for (int i = 0; i < 32; i++) {
                int count = 0;
                int mask = 1<<(i);
                // going through all array elements 
                for (int num : arr) {
                    // getting the ith bit using mask 
                    
                    // to check if the bit is 1 or not we use and operation 
                    if ((num & mask) !=0) {
                        count++;
                    }
                }
                // if not count is not a multiple of three this bit belongs to the answer 
                if (count%3 !=0) {
                    result = result | mask;
                }

            }
            return result;
        }
        static int magicno(int n){
            int answer = 0;
            int x = 1;
            while (n>0) {
                int bit  = n & 1;
                answer += ((bit) * (Math.pow(5, x)));
                x++;
                n = n>>1;
            }
            return answer;
        }
        static int digit(int n){
            int count = 0;
            while (n>0) {
                if (n == 0 ) {
                return 1;
                }
                count++;
                n = n>>1;
                
            }
            return count;
        }
        static int digitformula(int n,int b){
             return (int)(Math.log(n)/Math.log(b))+1;
        }
        static boolean twopowern(int n){
            int count = 0;
            while (n>0) {
                int bit = n &1;
                if (bit == 1) {
                count++;
                }
                n = n>>1;
                
            }
            if (count ==1) {
                return true;
            }else{
                return false;
            }
            
        }
        static boolean twopowernBetter(int n){
            return  ((n &(n-1)) ==0);
             
        }
}
