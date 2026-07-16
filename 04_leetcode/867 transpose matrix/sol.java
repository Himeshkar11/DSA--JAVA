import java.util.Arrays;

class sol {
    public static void main(String[] args) {
        int rows = 1;
        int cols = 4;
        int rStart =0 ;
        int cStart = 0;
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(spiralMatrixIII(rows, cols, rStart, cStart)));
        }
    }
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] arr = new int[rows][cols];
        int rend = rows-1;
        int cend = cols-1;
        int h = 0;
        while(h<= (rows * cols)-1){
            for(int i = cStart;i<=cend;i++){
                arr[h][0] = rStart;
                arr[h][1] = i;
                h++; 
            }
            for(int i = rStart+1;i<=rend;i++){
                arr[h][0] = i;
                arr[h][1] = cend;
                h++; 
            }
            for(int i = cend-1;i>=cStart;i--){
                arr[h][0] = rend;
                arr[h][1] = i;
                h++; 
            }
            for(int i =rend-1;i>=rStart+1;i--){
                arr[h][0] = i;
                arr[h][1] = cStart;
                h++; 
            }
            cStart++;
            rStart++;
            cend--;
            rend--;
        }
        return arr;
    }
}