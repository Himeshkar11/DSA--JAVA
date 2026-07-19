public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super(); // this will call custom Stack
    }
    public DynamicStack(int size){
        super(size); // it will call customStack(int size)
    }
    @Override
    public boolean push(int item){
        if (this.isFull()) {
            // double the array size
            int [] temp = new int[data.length*2];
            // copy of all elements 
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }    
            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
}
