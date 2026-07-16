import java.util.ArrayList;

public class q7 {
    // value euals to the index valule 
public static void main(String[] args) {
    int[] arr = {15, 2, 45, 4 , 7};
    System.out.println(answer(arr));
}

static ArrayList<Integer> answer(int[] arr){
    ArrayList<Integer> answer = new ArrayList<>(); 
    if (arr.length ==0) {
        return null;
    }
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]==i+1) {
            answer.add(i);;
        }
}
    return answer;
}
}
