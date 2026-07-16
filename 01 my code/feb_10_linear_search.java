public class feb_10_linear_search {
    public static void main(String[] args) {
        int [] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = Linearsearchindex(nums, target);
        System.out.println(ans);
        String name = "Himeshkar";
        System.out.println(minNUmber(nums));
        System.out.println(minNumber(nums));
        System.out.println(maxNUmber(nums));
        System.out.println(maxNumber(nums));
    }
    static int Linearsearchindex(int[] arr,int target){
        // this step below is one of the most important one 
        if (arr.length==0) {
            return -1;
        }
        // running a for loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        // if none of the return statement is executed ie the elemnt is not found 
        return -1; 
    }
    static int LinearsearchElement(int[] arr,int target){
                // this step below is one of the most important one 
        if (arr.length==0) {
            // this is a constant because who know maybe -1 is a value in the array 
            return Integer.MAX_VALUE;
        }
        // running a for loop
        // enhanced for loop
        for (int element : arr) {
            if(element == target){
                return element;
            }
        }
        // if none of the return statement is executed ie the elemnt is not found 

        return Integer.MAX_VALUE; 
    }
    // search the target and return ture if it exists else false
    static boolean LinearSearch(int[] arr ,int target){
                // this step below is one of the most important one 
        if (arr.length==0) {
            return false;
        }
        // running a for loop
        for (int element : arr) {
            if(element == target){
                return true;
            }
        }
        // if none of the return statement is executed ie the elemnt is not found 
        return false; 
    }
    static boolean search(String str, char target){
        // in strings the length is a function becuase we used arrays ka varibale to create this string function 
      if (str.length() ==0) {
        return false;
      }  
      for (int ch = 0; ch<str.length(); ch++) {
        if (str.charAt(0)==target) {
            return true;
        }
      }
      return false;
    }
    static boolean foreachsearch(String str,char target){
              if (str.length() ==0) {
        return false;
      }  
      // when trying to apply a for each loop in java 
    //   it will say can only iterate over an array or an instance 
    //   for (char element : str) { 
    // therefore use tochararray 
    for (char ch : str.toCharArray()) {
        if (ch==target) {
            return true;
        }
      }
      return false;
    }
    static int LinearsearchindexRange(int[] arr,int target,int start,int stop){
        // this step below is one of the most important one 
        if (arr.length==0) {
            return -1;
        }
        // running a for loop
        for (int i =start; i < stop; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        // if none of the return statement is executed ie the elemnt is not found 
        return -1; 
    }   
    static int minNUmber(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
    static int maxNUmber(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        return max;
    }
        static int minNumber(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
        static int maxNumber(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    }
 