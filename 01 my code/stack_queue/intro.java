import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class intro {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // popping till stack is empty
        // now adding another stack.pop();
        try {
            System.out.println(stack.pop());

        } catch (Exception e) {
            // will give this Exception
            System.out.println(e);
        }
        // deque in java 
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(12);
        deque.add(78);
        deque.add(15);
        System.out.println(deque.peekFirst());
    }
}