import java.util.List;
import java.util.ArrayList;
public class solution {
    public static void main(String[] args) {
        int [][]matrix  = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> answer = new ArrayList<>();
        int srow = 0 ; // starting row 
        int scol = 0; // starting column 
        int erow = matrix.length-1; // ending row
        int ecol = matrix[0].length-1; // ending row 
        while (srow <= erow && scol <=ecol) {
            // printing the top row 
            // starting row is constant
            for (int i = scol ; i <= ecol; i++) {
                answer.add(matrix[srow][i]);
            }
            // printing the right  row 
            // srow + 1 to avoid mutilple printing 
            // end column is constant
            for (int i = srow +1 ; i <= erow; i++) {
                answer.add(matrix[i][ecol]);
            }
            // printing the bottom row  row 
            // end row is constatn
            for (int i = ecol-1; i >= scol; i--) {
                if (srow == erow) {
                    break;
                }
                answer.add(matrix[erow][i]);
            }
            // printing the left  row 
            // start col is constant
            for (int i = erow-1 ; i >srow; i--) {
                if (ecol == scol) {
                    break;
                }
                answer.add(matrix[i][scol]);
            }
        srow++;
        scol++;
        ecol--;
        erow--;
        }


        return answer;
    }
}