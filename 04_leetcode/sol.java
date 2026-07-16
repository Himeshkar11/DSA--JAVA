public class sol{
    public static void main(String[] args) {
        

    }
    static boolean issentence3(String s1,String s2){
        int i = 0;
        int n1 = s1.length()-1;
        int j = s1.length()-1;
        // for sentece 1
        while(s1.charAt(i)!=' '){
            i++;
        }
        // now i became the end index for the first word of the s1 
        while(s1.charAt(j)!=' '){
            j--;
        }
        // now j became the start index of of the suffix word 
        // prefix : 0 --> i
        // suffix : j --> n1
        // for sentence 2 
        int a =0;
        int n2 = s2.length()-1;
        int b = s2.length()-1;
        while(s2.charAt(a)!=' '){
            a++;
        }
        // now a became the end index for the first word of the s2
        while(s2.charAt(b)!=' '){
            b--;
        }
        // now b  became the start index of of the suffix word    
        // prefix : 0 --> a 
        // suffix : b --> n2

        int q = 0;
        int w = 0;
        while(q<=a && w>=n2){
            if (s1.charAt(q) != s2.charAt(q) || s1.charAt(w)!=s2.charAt(w)) {
                return false;
            }
        } 
        return true;
        
        




    }
}
