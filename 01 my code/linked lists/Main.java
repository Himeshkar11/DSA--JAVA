public class Main {
    public static void main(String[] args) {
        // System.out.println("linked list created ");
        // linkedlists lists = new linkedlists();
        // lists.insertFirst(10);
        // lists.insertFirst(20);
        // lists.insertFirst(30);
        // lists.insertLast(40);
        // lists.insertLastManual(48);
        // lists.insert(99, 2);
        // lists.Display();
        // System.out.println(lists.DeleteLastM1());
        // lists.Display();
        // System.out.println(lists.DeleteLastM2());
        // lists.Display();
        // System.out.println();
        // System.out.println(lists.deleteFIrst());
        // lists.Display();
        // lists.Display();

        // lists.insertRec(25, 2);
        // System.out.println("NEW INSETION USING RECURSION || \n");
        // lists.Display();

        linkedlists list = new linkedlists();
        list.insertFirst(12);
        list.insertFirst(18);
        list.insertFirst(1);
        list.insertLast(36);
        list.insertLastManual(48);
        list.insert(99, 2);

        list.Display();
        list.bubblesort();
        System.out.println("List after bubbble sort  \n");
        list.Display();

        // // System.out.println("\n after deletion with first method");
        // // System.out.println(list.DeleteLastM1());
        // // list.Display();
        // System.out.println("\n after deletion with second method");
        // System.out.println(list.DeleteLastM2());
        // list.Display();
        // System.out.println(list.DeleteSpecific(4));
        // list.Display();
        // System.out.println(list.find(1));

        // System.out.println("DOUBLE LINKED LISTS");
        // doublelinkedlists dll1 = new doublelinkedlists();
        // dll1.insertFirst(20);
        // dll1.insertFirst(30);
        // dll1.insertFirst(40);
        // dll1.insertFirst(50);
        // dll1.insertFirst(60);
        // dll1.insertFirst(70);
        // dll1.insertLast(80);
        // dll1.Display();
        // // dll1.DisplayRev();
        // circularLinkedList cll = new circularLinkedList();
        // cll.insert(89);
        // cll.insert(79);
        // cll.insert(69);
        // cll.insert(59);
        // cll.insert(49);
        // cll.insert(39);
        // cll.Display();
        // System.out.println();
        // cll.Delete(39);
        // cll.Display();
        // merging the linked list 
        linkedlists first = new linkedlists();
        linkedlists second = new linkedlists();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);


        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        
        linkedlists ans = linkedlists.Merge(first, second); 
        ans.Display();


    }
}
