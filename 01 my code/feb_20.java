import java.util.Arrays;

public class feb_20 {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}

        };
        System.out.println(Arrays.toString(search(arr, 10)));
    }
    // creating a binary search function for the last remaninng two rows 
    static int[] BinarySearch(int[][]arr,int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd) {
            int mid = cStart + (cEnd-cStart)/2;
            if (arr[row][mid] == target) {
                return new int[] {row,mid};
            }
            if (arr[row][mid] < target) {
                cStart = mid +1; ;
            }else{
                cEnd = mid -1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][]arr,int target){
        int rows = arr.length; 
        int cols = arr[0].length; // taking the first row`s elements by this 
        // it may  be possible that the given array is a single dimeansional array 
        if (rows == 1) {
            // here the row taken is zero becuse only one row exists in this case 
            //  the value of cStart = 0 is becuase we are searching from the oth element of the singe row array 
            // the value of cEnd is cols-1 becuase we are searching the whole single row array 
            return BinarySearch(arr, 0, 0, cols-1, target);
        }
        // task is to make a loop after which it will give us only two elements
        int rStart =0; // making a variable for the start of the rows 
        int rEnd = rows-1; // making a variable for the end of the rows
        int cMid = cols/2; // since cols is already the length of the row 
        // end - 1  becuase  we want to stop at the last two arryas otherwise we will make the loop run till the last row 
        while (rStart<(rEnd-1)) {
            int mid = rStart+(rEnd-rStart)/2;
            if (arr[mid][cMid] < target) {
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        // now we have to check for the last two left rows \
        // check whether the target is in the colum of two rows 
        if (arr[rStart][cMid] == target) {
            return new int[] {rStart,cMid};
        }
        if (arr[rStart+1][cMid] == target) {
            return new int[]{rStart+1,cMid};
        }
        // search in first half 
        // get the coordinates by the pic 
        if (target <= arr[rStart][cMid-1]) {
           return BinarySearch(arr, rStart, 0, cMid - 1, target);
        }
        // search in second half 
        if (target >= arr[rStart][cMid+1] && target <=arr[rStart][cols-1]) {
            return BinarySearch(arr, rStart,cMid+1,cols-1,target);
        }
        // search in third half 
        if (target <= arr[rStart + 1][cMid - 1]) {
            return BinarySearch(arr, rStart + 1, 0, cMid - 1, target);
}
        // search in fourth half 
        else {
            return BinarySearch(arr, rStart+1,cMid+1,cols-1,target);
        }
    }
}
