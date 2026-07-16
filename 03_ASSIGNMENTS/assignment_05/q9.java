public class q9 {
    // public static void main(String[] args) {
    //     String str = "thequickbrownfoxjumpsoverthelazydog";
    //     int ans = 0;
    //     for (int i = 65; i <=90; i++) {
    //         for (int j = 0; j < str.length; j++) {
    //             if((int)str[j] == i){
    //                 ans++;
    //             } 
    //         }

    //     }
    //     if(ans == 35 ){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
    static boolean answer(String str){
        int ans = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    found = true;
                    break;
                }
                if (found) {
                    ans++;
                }
            }
            
    }
    if (ans >= 26) {
        return true;
    }else{
        return false;
    }
}
}

