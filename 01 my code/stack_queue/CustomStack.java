public class CustomStack{
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    public CustomStack(int size){
        this.data = new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    int top = -1;
    public boolean push(int item){
        if(isFull()){
            return true;
        }
        top++;
        data[top] = item;
        return true;
    }
    public boolean isFull(){
        return top == data.length-1;
    }
    public boolean isEmpty(){
        return top ==-1;
    }
    public int pop () throws Exception{
        if (isEmpty()) {
            throw new Exception("Cannot pop from an empty stack");
        }
        int removed = data[top];
        top--;
        return removed;

    }
    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("Cannot peak from empty stack");

        }
        return data[top];
    }


}