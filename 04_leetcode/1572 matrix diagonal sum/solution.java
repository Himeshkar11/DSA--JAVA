// class Solution {
// public int diagonalSum(int[][] mat) {
// int sum = 0;
// for (int i = 0; i < mat.length; i++) {
// for (int j = 0; j < mat[i].length; j++) {
// if (i == j) {
// sum+=mat[i][j];
// }
// if (i+j == mat.length-1) {
// sum+=mat[i][j];
// }
// }
// }
// if (mat.length %2 !=0) {
// return sum;
// }else{
// return sum - mat[mat.length/2][mat.length/2];
// }
// }
// }
// optimized code is
