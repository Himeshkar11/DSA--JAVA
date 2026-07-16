public class mar_16_bits {
    public static void main(String[] args) {
        // using bits to solve problem 
        int x = 52;
        System.out.println(iseven(x));
    }
    static boolean iseven(int n){
        // explanation in notes 
        return (n & 1) ==0;
    }
}
