public class apr15{
    public static void main(String[] args) {
        System.out.println("hey");
        onetoN(5);
    }
    static void onetoN(int n){
        if(n==0){
            return;
        }
        System.out.print(6-n);
        onetoN(n-1);
    }
    
    
}