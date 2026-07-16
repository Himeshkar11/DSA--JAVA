import java.util.ArrayList;
import java.util.Arrays;

public class apr25 {
    public static void main(String[] args) {
        int [] arr = {1,6,7,8,8,9,15,60,70,78};
        lsmultiple(arr, 8, 0);
        System.out.println(list);
        ArrayList<Integer> listt = new ArrayList<>();
        
        System.out.println(lsmultipleList(arr, 8, 0, listt));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void lsmultiple(int[] arr,int target,int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        lsmultiple(arr, target, index+1);
    }
    static ArrayList<Integer> lsmultipleList(int [] arr, int target,int index,ArrayList<Integer> listt ){
        if (index==arr.length) {
            return listt;
        }
        if (arr[index]== target) {
            listt.add(index);
        }
        return lsmultipleList(arr, target, index+1, listt);
        
    }

}
