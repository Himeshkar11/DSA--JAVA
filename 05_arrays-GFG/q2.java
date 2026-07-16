public class q2 {
    public static void main(String[] args) {
        
    }
    static int solution(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return i;
            }
        }
        return -1;

    }
}
