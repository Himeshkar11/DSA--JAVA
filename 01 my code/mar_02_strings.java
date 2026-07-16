public class mar_02_strings {
    public static void main(String[] args) {
        String name = "Himesh";
        System.out.println(name);
        String a = "himesh";
        System.out.println(a);
        a = "kyoronin"; // creating a new object not modify the old one 
        System.out.println(a);
        // string comparisions 
        String a1 = "himesh";
        String b1 = "himesh";
        System.out.println(a1==b1);
        String a2 = "himesh";
        String b2 = "Kyoronin";
        System.out.println(a2==b2);
        // creating new objects outside pool 
        String a3 = new String("Himesh");
        String b3 = new String("Himesh");
        System.out.println("creating objects condition" + a3 ==b3 );
        // comparing the value 
        String a4 = "himesh";
        String b4 = "himesh";
        System.out.println("comparing the values "+ a4.equals(b4));
        
    }
}
