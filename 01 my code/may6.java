public class may6{
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        maze1("", 3, 3);
    }
    static int count(int r,int c){
        if ( r== 1 || c==1) {
            return 1;
        }
        int down = count( r, c-1);
        int right   = count(r-1, c);
        return right + down;
    }
    static void maze1(String p,int r,int c){
        if (r ==1 && c==1) {
            System.out.println(p);
            return;
        }
        if (r>1) {
            maze1(p+'D', r-1, c);
        }
        if (c>1) {
            maze1(p+'R', r, c-1);
        }
    }
}