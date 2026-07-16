public class q9 {
    // To find Armstrong Number between two given number.
    public static void main(String[] args) {
        int lower = 100; // Change this value to set the lower limit
        int upper = 999; // Change this value to set the upper limit
        
        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        
        for (int num = lower; num <= upper; num++) {
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();
            
            while (originalNum != 0) {
                int digit = originalNum % 10;
                sum += Math.pow(digit, digits);
                originalNum /= 10;
            }
            
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
