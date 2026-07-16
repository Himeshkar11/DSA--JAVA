import java.util.ArrayList;
import java.util.Arrays;

public class mar_04_strings {
    public static void main(String[] args) {
        // string concatenation operator 
        // for characters
        System.out.println('a'+ 'b');
        // here each character is coverted into its ACII value and added
        // for strings 
        // this + operator will concatenate the string 
        System.out.println("a"+ "b"); //ab concatenation
        // character and a number 
        System.out.println('a'+3);
        // string and a number
        System.out.println("a"+3);
        // string and a array list
        System.out.println("himesh"+new ArrayList<>());
        // string and a intger of integer class 
        System.out.println("Himesh" + new Integer(56));
        // the + operator only works among primitives and complex objects if one of them is a string
        // you can not  use like this 
        // System.out.println(new Integer(56) + new ArrayList<>());
        // but you can use it like this 
        System.out.println(new Integer(56) +" "+ new ArrayList<>());
        // string performance 
        // program to first print all the characters 
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' +i);
            System.out.println(ch);
        }

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series+=ch;
            // it will add "" + ch ==> a 
            // as loop continues it will concatenate the values 
            }
            System.out.println(series);
            // stringBUilder
            StringBuilder builder = new StringBuilder();
            // printing the series of numbers 
            // String answer = "";
            for (int i = 0; i < 26; i++) {
                char ch = (char)('a'+i);
                builder.append(ch);
            }
            System.out.println("USING STRING BUILDER");
            System.out.println(builder);

            // string methods 
            String name = "Himesh";
            System.out.println(name.length());
            System.out.println(name.charAt(2));
            System.out.println(name.concat("kar"));
            System.out.println(name.substring(1, 3));
            System.out.println(Arrays.toString(name.toCharArray()));
            System.out.println(name.toUpperCase());
            System.out.println(name.isEmpty());

        // palindrome question 
        String str = "abcba";
        System.out.println(ispalindrome(str));




    }
    static boolean ispalindrome(String str){
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse +=str.charAt(str.length()-1-i);
        }
        if (reverse.equals(str)) {
            return true;
        }else{
            return false;
        }
    }
}
