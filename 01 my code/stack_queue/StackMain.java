public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        System.out.println(stack.pop());
        DynamicStack stk = new DynamicStack();
        stk.push(41);
        stk.push(78);
        stk.push(12);
        stk.push(13);
        stk.push(45);
        stk.push(99);
        stk.push(67);
        stk.push(37);
        stk.push(61);
        stk.push(65);
        System.out.println(stk.pop());
        
    }
}
