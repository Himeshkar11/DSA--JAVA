public class solution{
    public static void main(String[] args) {
        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] arr = answer(matrix, target);
        if (arr[0]==-1) {
            return false;
        }
        else{
            return true;
        }
    }
    static int[] answer(int[][] arr,int target){
        int Rstart = 0;
        int Cstart =0;
        int Rend = arr.length-1;
        int Cend = arr[0].length-1;
        if (arr.length == 1) {
            return binarySearch(arr,0,0,arr[0].length-1,target);
        }
        while(Rstart <= Rend && Cend>=Cstart){
            if (arr[Rstart][Cend] == target) {
                return new int[] {Rstart,Cend};
            }
            if (arr[Rstart][Cend] > target) {
                Cend--;
            }else{
                Rstart++;
            }
        }
        return new int[] {-1,-1};
    }
        static int[] binarySearch(int[][] arr,int row,int start,int end,int target){
        while(start <=end){
            int mid = start + (end-start)/2;
            if (arr[row][mid]==target) {
                return new int[] { row,mid};
            }
            if (arr[row][mid]<target) {
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return new int[] {-1,-1};
    }
}