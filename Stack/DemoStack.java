public class DemoStack {
    public static void main(String[] args) {
     /*   ArrayStack<Integer> stack=new ArrayStack<>();
        stack.isEmpty();
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.peek();
        */
      // LinkedStack Implements
        LinkedStack<Integer> stackls= new LinkedStack<Integer>();
        stackls.push(5);
        stackls.push(6);
        stackls.pop();
        stackls.peek();
    }
}
