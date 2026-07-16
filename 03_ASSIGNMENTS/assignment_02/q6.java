import java.util.Scanner;
public class q6 {
        // Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter amount in rupees: ");
        double rupees = sc.nextDouble();
        double exchangeRate = 0.013; // 1 rupee = 0.013 USD
        double dollars = rupees * exchangeRate; 
        System.out.println("Equivalent amount in USD: " + dollars);
        sc.close();
    }
}
