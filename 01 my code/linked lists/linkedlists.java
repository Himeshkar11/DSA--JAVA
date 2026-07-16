public class linkedlists {
    private Node head;
    private Node tail;
    private int size;

    public linkedlists() {
        this.size = 0;
    }

    private static class Node {
        // since every ll is having a head and a tail

        // since i dont want anyone to acces these directly i made them private
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // insertion at beginning for single linked list
    public void insertFirst(int val) {
        // first create the node you want to insert and pass it value in the constructor
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            // then this is the first item being added
            tail = head;
        }
        size++;
    }

    // display function used to traverse the entire linked list
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");

    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertLastManual(int value) {
        Node node = new Node(value);
        Node temp = head;
        if (head == null) {
            insertFirst(value);
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        temp = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        // the next one of this will be the temp
        // instead of creating a variable to store the temp`s next field so i have put
        // it in the constructor only
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFIrst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;

        }
        size--;
        return value;

    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int DeleteLastM1() {
        if (size <= 1) {
            deleteFIrst();
            return -1;
        }
        Node SecondLast = getNode(size - 2);
        int value = tail.value;
        tail = SecondLast;
        tail.next = null;
        size--;
        return value;
    }

    public int DeleteLastM2() {
        Node temp = head;
        if (size <= 1) {
            return deleteFIrst();
        }
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        Node last = temp.next;
        temp.next = null;
        size--;
        return last.value;
    }

    public int DeleteSpecific(int index) {
        if (index == 0) {
            deleteFIrst();
        }
        if (index == size) {
            DeleteLastM1();
        }
        Node prev = getNode(index - 1);
        Node succ = getNode(index + 1);
        Node curr = getNode(index);
        int value = curr.value;
        prev.next = succ;
        curr.next = null;
        return value;

    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);

    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void removeDup() {
        Node node = head;
        while (node.next != null) {
            if (node.next != null && node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public static linkedlists Merge(linkedlists first, linkedlists second) {
        Node f = first.head;
        Node s = second.head;
        linkedlists ans = new linkedlists();
        while (f.next != null && s.next != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }

        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;

    }

    public void bubblesort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            Node first = getNode(col);
            Node second = getNode(col + 1);
            if (first.value > second.value) {
                // swap
                // there are three cases while we want to swap
                // case 1 : when the first is on head
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                // case 2 : when the first is on tail
                else if (first == tail) {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                // case 3 : at random positions
                else {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;

                }
            }
            bubbleSort(row, col + 1);

        } else {
            bubbleSort(row - 1, 0);

        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;

        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        int index = 0;
        if (head == null) {
            return null;
        }
        while (temp != null) {
            if (temp.val == val) {
                if (temp == head) {
                    head = head.next;
                } else if (temp == tail) {
                    ListNode SecondLast = head;
                    while (SecondLast.next.next != null) {
                        SecondLast = SecondLast.next;
                    }
                    tail = SecondLast;
                    tail.next = null;
                } else {
                    ListNode prev = getListNode(head, index - 1);
                    ListNode succ = getListNode(head, index + 1);
                    ListNode curr = getListNode(head, index);
                    prev.next = succ;
                    curr.next = null;
                }

            } else {
                temp = temp.next;
                index++;
            }
        }
        return head;
    }

    private ListNode getListNode(ListNode head, int index) {
        ListNode temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp;
    }
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        node = tail;
        tail.next = null;
    }
    

}
