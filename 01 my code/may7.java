public class may7 {
    public static void main(String[] args) {
        
    }
    static void diagnoalmaze(String p,int r,int c){
        if (r==1 && c==1) {
            System.out.println(p);
            return;
        }
        if (r>1) {
            diagnoalmaze(p+'s', r-1, c);
        }
        if(c>1){
            diagnoalmaze(p+'R', r, c-1);
        }
        if(r>1 && c >1){
            diagnoalmaze(p+'D', r-1, c-1);
        }
    }
    static void obstaclepath(String p,boolean[][] maze,int r,int c){
        
    }
}
