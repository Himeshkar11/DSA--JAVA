public class may2 {
    public static void main(String[] args) {
        skip("","adgeagarataf", 'a');
        System.out.println(skip("hello", 'l'));
        System.out.println(skipString("iamdog", "dog"));
        System.out.println(skipString2("thisisappe", "apple","app"));
    }
    static void skip(String p,String up,char tar){
        // if there is char tar in up remove it and retrun the String
        if (up.isEmpty()) {
            // it the length of up is zero
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == tar) {
            // dont add it into the p and move on 
            skip(p, up.substring(1), tar);
        }else{
            skip(p+ch, up.substring(1), tar);
        }
    }
    static String skip(String up , char tar){
        // this will directly return a string by modifying the string up 
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch==tar) {
            return skip(up.substring(1), tar);
        }else{
            return ch + skip(up.substring(1), tar);
        }
    }
    static String skipString(String up,String tar){
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith(tar)) {
            return skipString(up.substring(tar.length()), tar);
        }else{
            return up.charAt(0) + skipString(up.substring(1), tar);
        }
    }
        static String skipString2(String up,String tar,String str){
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith(str) && !up.startsWith(tar)) {
            return skipString2(up.substring(str.length()), tar,str);
        }else{
            return up.charAt(0) + skipString2(up.substring(1), tar,str);
        }
    }
}
