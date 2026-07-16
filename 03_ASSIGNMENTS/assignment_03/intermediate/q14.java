package assignment_03.intermediate;

public class q14 {
    // Find Ncr & Npr/
    public static void main(String[] args) {
        int n = 5; // Change this value to set the total number of items
        int r = 2; // Change this value to set the number of items to choose

        long nFactorial = factorial(n);
        long rFactorial = factorial(r);
        long nMinusRFactorial = factorial(n - r);

        long nCr = nFactorial / (rFactorial * nMinusRFactorial);
        long nPr = nFactorial / nMinusRFactorial;

        System.out.println("Ncr (Combinations) for n=" + n + " and r=" + r + " is: " + nCr);
        System.out.println("Npr (Permutations) for n=" + n + " and r=" + r + " is: " + nPr);
    }
    static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
