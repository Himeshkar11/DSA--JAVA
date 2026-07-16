class Solution {
    public boolean checkIfPangram(String str) {
        int ans = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    found = true;
                    break;
                }

            }
            if (found) {
                ans++;
            }

        }
        if (ans >= 26) {
            return true;
        } else {
            return false;
        }
    }
}