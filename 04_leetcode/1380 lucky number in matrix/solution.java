import java.util.ArrayList;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> answercol = new ArrayList<>();
        ArrayList<Integer> answerfinal = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int maxele = matrix[0][0];
            int minele= matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]<minele) {
                   minele = matrix[i][j]; 
                }
                if (matrix[j][i] > maxele) {
                    maxele = matrix[j][i];
                }
            }
            answercol.add(minele);
            answerfinal.add(maxele);
        }
        for (Integer integer : answercol) {
            for (Integer integer2 : answerfinal) {
                if (integer == integer2) {
                    answer.add(integer);
                }
            }
        }
        return answer;




    }
}