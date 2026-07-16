package assignment_03.basic;

public class q21 {
    // Fibonacci Series In Java Programs
    public static void main(String[] args) {
        int n = 10; // Change this value to calculate the Fibonacci series for a different number of terms
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
