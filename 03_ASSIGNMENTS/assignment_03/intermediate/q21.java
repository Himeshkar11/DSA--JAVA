package assignment_03.intermediate;

public class q21 {
    // Java Program Vowel Or Consonant
    public static void main(String[] args) {
        char ch = 'E'; // Change this value to test with different characters
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not an alphabetic character.");
        }
    }
}
