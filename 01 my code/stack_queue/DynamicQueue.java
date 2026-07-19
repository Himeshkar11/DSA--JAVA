public class DynamicQueue extends CircularQueue {
        public DynamicQueue(){
        super(); // this will call custom Stack
    }
    public DynamicQueue(int size){
        super(size); // it will call customStack(int size)
    }
    @Override
    public boolean insert(int item){
        if (this.isFUll()) {
            // double the array size
            int [] temp = new int[data.length*2];
            // copy of all elements 
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)%data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.insert(item);
    }
}
