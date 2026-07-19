public class CustomQueue {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }
    int end = 0;
    public boolean isFUll(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end ==0;

    }
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
            int removed = data[0];
            // shift the elements to left
            for (int i = 1; i < end; i++) {
                data[i-1] = data[i];
            }
            end--;
            return removed;
        }
        public boolean insert(int item){
            if (isFUll()) {
                return false;
            }
            data[end++] = item;
            return true;
        }
        public int peek() throws Exception{
            if (isEmpty()) {
                throw new Exception("Queue is full");
            }
            return data[0];
        }
        public void Diaplay(){
            for (int i = 0; i < end; i++) {
                System.out.println(data[i] +" ");
            }
            System.out.println("END");
        }

    }

