public class mar_17_bits {
    public static void main(String[] args) {
        // int[] arr1 = {2,1,4,5,6,5,2,1,4};
        // System.out.println(SingleNumber(arr1));
        // System.out.println(findbit(10110110, 5));
        // System.out.println(setBit(86, 4));
        System.out.println(ResetBit(5, 1));
    }
    static int SingleNumber(int[] arr){
        // there is an array arr such that 
        // all its elements conitains their dupliacates except one 
        // return that one
        // using XOR operation
        // we know a^ a = 0 // so when same elements are did they become zero 
        // we know a^0 = a  // and that zero is xored with a to give a 
        // we know order doesnt matte rin xor operation 
        int answer = 0; // to create the xor oeration at first 
        for (int ele: arr) { // every element in arr 
            answer = answer^ele;// we xor answer wiht element each time and save it as answer again 
        }
        return answer; // returning the only left element
    }
    static int findbit(int n,int k){
        // given a number n 
        // we want  to find the bit avaiable at kth 
        // to get the bit at kth index we want to mask it at kth index 
        //  create a mask of index k 
        int mask = 1<< (k-1);
        // now to get the bit at  kth index we nand it with mask 
        return n &mask;
    }
    static int setBit(int n , int k){
        // given a number n and we wnat to set the kth bit 
        // set means make it 1 always 
        // we know that or  with 1 any number gives 1 
        // so we or  the mask with the given number 
        // creating the mask 
        int mask = 1 <<(k-1); // mask created 
        // or with the number 
        return n | mask;
    }
    static int ResetBit(int n,int k){
        // given a number n reset it`s kth bit 
        // reset means that make it 0 always 
        // for this lets create the  mask first 
        // int mask = 1<<(k-1);
        // this is wrong  as we want to do an and with 0 
        // so take the completement of the mask we created 
        int mask = ~(1<<(k-1));
        // we and the mask and the number to get 0 
        return n & mask;
    }

}
