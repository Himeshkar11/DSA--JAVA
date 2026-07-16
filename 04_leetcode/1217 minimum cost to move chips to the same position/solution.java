class solution{
    public static void main(String[] args) {
        int [] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }
    static  int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i]%2==0) {
                odd++;
            }else{
                even++;
            }
        }
    
        return Math.min(even, odd);
    }
}