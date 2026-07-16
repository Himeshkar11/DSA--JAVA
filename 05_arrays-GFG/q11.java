import java.util.ArrayList;

public class q11 {
    public static void main(String[] args) {
        
    }
        public int search(int k, ArrayList<Integer> arr) {
        // code here
        if (arr.size() ==0) {
            return -1;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return i+1;
            }
        }
        return -1;
        
    }
}
