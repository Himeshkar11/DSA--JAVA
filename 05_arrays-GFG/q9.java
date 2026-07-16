public class q9 {
    public static void main(String[] args) {
        System.out.println(num_palindrome(111));
    }
    static boolean paliarray(int[] arr){
        if (arr.length==0) {
            return false;
        }
        int n = arr.length -1;
        for (int i = 0; i < arr.length; i++) {
            if (num_palindrome(arr[i])) {
                // nothing checked
            }
            else{
                return false;
            }
        }  
        return true; 

    }
    static boolean num_palindrome(int n){
        int k = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 +rem;
            n = n/10;
        }
        if (k == rev) {
            return true;
        }
        else{
            return false;
        }

    }

}
