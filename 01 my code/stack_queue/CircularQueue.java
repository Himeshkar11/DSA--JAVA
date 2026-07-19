public class CircularQueue {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    protected int end = 0;
    protected int front = 0;
    protected int size = 0;
    public boolean isFUll(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size ==0;

    }
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
            int removed = data[front];
            front = front%data.length;
            // shift the elements to left
            size--;
            return removed;
        }
        public boolean insert(int item){
            if (isFUll()) {
                return false;
            }
            data[end++] = item;
            end = end %data.length;
            size++;
            return true;
        }
        public int front() throws Exception{
            if (isEmpty()) {
                throw new Exception("Queue is full");
            }
            return data[front];
        }
        public void Diaplay(){
            if (isEmpty()) {
                System.out.println("EMPTY");
                return;
            }
            int i = front;
            do{
                System.out.println(data[i]);
                i++;
                i = i%data.length;

            }while(i!=end);
            System.out.println("END");

        }
}
