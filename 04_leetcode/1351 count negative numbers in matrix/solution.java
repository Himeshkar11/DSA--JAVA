class Solution {
    public int countNegatives(int[][] matrix) {
        int srow = 0 ; // starting row 
        int scol = 0; // starting column 
        int erow = matrix.length-1; // ending row
        int ecol = matrix[0].length-1; // ending row 
        int count = 0;
        while (srow <= erow && scol <=ecol) {
            // printing the top row 
            // starting row is constant
            for (int i = scol ; i <= ecol; i++) {
                if(matrix[srow][i]<0){
                    count++;
                }
            }
            // printing the right  row 
            // srow + 1 to avoid mutilple printing 
            // end column is constant
            for (int i = srow +1 ; i <= erow; i++) {
                if(matrix[i][ecol]<0){
                    count++;
                }
            }
            // printing the bottom row  row 
            // end row is constatn
            for (int i = ecol-1; i >= scol; i--) {
                if (srow == erow) {
                    break;
                }
                if(matrix[erow][i]<0){
                    count++;
                }
            }
            // printing the left  row 
            // start col is constant
            for (int i = erow-1 ; i >srow; i--) {
                if (ecol == scol) {
                    break;
                }
                if(matrix[i][scol]<0){
                    count++;
                }
            }
        srow++;
        scol++;
        ecol--;
        erow--;
        }
        return count;
    }
}