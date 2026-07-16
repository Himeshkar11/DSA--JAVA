package validpalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z]", "");
        str.toLowerCase();
        StringBuilder rev = new StringBuilder();
        for(int i=str.length()-1;i>0;i--){
            rev +=str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        }
        return false;
    }
}
