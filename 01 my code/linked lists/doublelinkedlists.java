public class doublelinkedlists {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next,Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public doublelinkedlists(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
        
    }
    public void Display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
        public void DisplayRev(){
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        Node temp = last;
        while (temp!=null) {
            System.out.print(temp.value + "-->");
            temp = temp.prev;

        }
        System.out.println("END");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        if (head == null) {
            node.prev = null;
            head = node;
        }
        node.prev = temp;
        node.next = null;
        temp.next = node;
        temp = node;
        size++;

    }
    

}
