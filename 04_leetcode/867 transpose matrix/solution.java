// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix.length; j++) {
//                 if (i!=j) {
//                     // swap//
//                     int temp = matrix[i][j];
//                     matrix[i][j] = matrix[j][i];
//                     matrix[j][i] = temp;
//                 }
//             }
//         }
//         return matrix;
//     }
// }
// the logic is correct but implementation is wrong 
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int [][] transopse = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transopse[j][i] = matrix[i][j];
            }
        }
        return transopse;
    }
}