public class circularLinkedList {
    private Node head;
    private Node tail;
    circularLinkedList(){
        this.tail  = null;
        this.head = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next  = node;
        node.next = head;
        tail = node;
    }

    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void Display(){
        Node node = head;
        if (head!=null){
            do{
                System.out.print(node.value + "-->");
                node = node.next;
            }while(node!=head);

        }
    }
    public void Delete(int val){
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }

}
