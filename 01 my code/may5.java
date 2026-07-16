import java.util.ArrayList;

public class may5{
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padList("", "12").toString());
        System.out.println(padCount("", "12"));
        dice("", 4);
        System.out.println(diceList("", 4).toString());
    }
    static void pad(String p,String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) -'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }
        static ArrayList<String> padList(String p,String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p); 
            return list;
        }
            ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) -'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padList(p+ch,up.substring(1)));
        }
        return ans;
    }
            static int padCount(String p,String up){
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) -'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            count +=(padCount(p+ch,up.substring(1)));
        }
        return count;
    }
    static void dice(String p,int target){
        if (target ==0) {
            System.out.println(p);
            return;
        
        }
        for(int i = 1; i<= 6 && i<=target;i++){
            dice(p+i, target-i);
        }
    }
    // as an arraylist 
    static ArrayList<String>  diceList(String p,int target){
        if (target ==0) {
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list ;
        
        }
            ArrayList<String>  ans = new ArrayList<>();

        for(int i = 1; i<= 6 && i<=target;i++){
            ans.addAll(diceList(p+i, target-i));
        }
        return ans;
    }  
}