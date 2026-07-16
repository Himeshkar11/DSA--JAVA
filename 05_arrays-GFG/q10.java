public class q10 {
    public static void main(String[] args) {
        
    }
    static int arraySum(int arr[]) {
        if (arr.length==0) {
            return -1
        }
        int sum =0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
