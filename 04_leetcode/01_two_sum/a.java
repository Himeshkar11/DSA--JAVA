public class a {
    
public static void main(String[] args) {
    // longestCommonPrefix({"flower})
}
    public String longestCommonPrefix(String[] strs) {
        String ans = "" ;
        for (int i = 0; i < strs.length; i++) {
          for (int j = 0; j < strs.length;j++) {
            if (strs[i].charAt(j)== strs[i+1].charAt(j)) {
                // String ans = () strs[i].charAt(j);
            ans =Character.toString(strs[i].charAt(j));
            }
   

          }

        
        }   
        
        return ans;

    }
}

