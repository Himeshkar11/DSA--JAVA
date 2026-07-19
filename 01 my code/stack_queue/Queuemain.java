public class Queuemain {
    public static void main(String[] args) throws Exception {
    CustomQueue q = new CustomQueue();
        q.insert(12);
        q.insert(28);
        q.insert(61);
        q.insert(61);
        q.insert(34);
        q.insert(3);
        System.out.println(q.remove());
        q.Diaplay();
        CircularQueue cq = new CircularQueue();
        cq.insert(12);
        cq.insert(98);
        cq.insert(96);
        cq.insert(65);
        cq.insert(37);
        cq.Diaplay();
        DynamicQueue dq = new DynamicQueue();
        dq.insert(12);
        dq.insert(16);
        dq.insert(11);
        dq.insert(22);
        dq.insert(32);
        dq.insert(93);
        dq.insert(45);
        dq.Diaplay();
    }

    

}
