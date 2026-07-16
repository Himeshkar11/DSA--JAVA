public class r4 {
   
    public static void main(String[] args) {
    //  q1 celing if a number 
    int [] arr = {2,3,5,9,14,16,18};
    int target = 15;
    // return  the smallest  element present in the array that are greater than or equals to the target 
    System.out.println(celiling(arr, target));

    // q2 flooring of  a number 
    // return the largeest element present in the 
        
    }
    static int celiling(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target ){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}
