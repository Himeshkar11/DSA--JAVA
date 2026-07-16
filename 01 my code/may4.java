import java.util.ArrayList;

public class may4{
    public static void main(String[] args) {
        permuatations("","abc");
        System.out.println(permuatationscount("", "abc"));
        System.out.println(permuatationsAl("", "abc").toString());
    }
    static void permuatations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i =0;i<=p.length();i++){
            String left = p.substring(0, i);
            String right = p.substring(i,p.length());
            permuatations(left+ch+right, up.substring(1));
        }
    }
    static ArrayList<String> permuatationsAl(String p,String up){
        if(up.isEmpty()){
            ArrayList <String> list  = new ArrayList<>();
            list.add(p);
            return list ;
        }
        
        char ch = up.charAt(0);
        ArrayList <String> answer = new ArrayList<>();

        for(int i =0;i<=p.length();i++){
            String left = p.substring(0, i);
            String right = p.substring(i,p.length());
            answer.addAll(permuatationsAl(left+ch+right, up.substring(1)));
        }
        return answer;

    }
        static int permuatationscount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for(int i =0;i<=p.length();i++){
            String left = p.substring(0, i);
            String right = p.substring(i,p.length());
            count +=permuatationscount(left+ch+right, up.substring(1));
        }
        return count;
    }
    
}