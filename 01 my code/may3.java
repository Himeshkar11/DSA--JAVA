import java.util.ArrayList;

public class may3{
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(SubSeqRet("", "abc").toString());
        System.out.println(SubSeqRetascii("", "abc").toString());
        subseqascii("", "abc");
        int [] nums = {1,2,3};
        System.out.println(iteration(nums).toString());
    }
    static void subseq(String p,String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p, up.substring(1));
    }
    // haha debuggging is fun 

    // returning as an array list 
    static ArrayList<String> SubSeqRet(String p,String up){
        if (up.isEmpty() ) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = SubSeqRet(p+ch, up.substring(1));
        ArrayList<String> Right = SubSeqRet(p, up.substring(1));
        left.addAll(Right);
        return left;
    }
        static ArrayList<String> SubSeqRetascii(String p,String up){
        if (up.isEmpty() ) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = SubSeqRetascii(p+ch, up.substring(1));
        ArrayList<String> second = SubSeqRetascii(p, up.substring(1));
        ArrayList<String> third = SubSeqRetascii(p + (ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
        static void subseqascii(String p,String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p, up.substring(1));
        subseq(p +(ch+0), up.substring(1));
        
    }
    static ArrayList<ArrayList<Integer>>   iteration(int [] nums){
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>()); 
            for (int ele : nums) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for(int i = 0; i<answer.size();i++){
            ArrayList<Integer> temp = new ArrayList<>(answer.get(i)); // copy
            temp.add(ele); // add current element
            list.add(temp);
                
            }
            answer.addAll(list);
        }
        return answer;

    } 

}