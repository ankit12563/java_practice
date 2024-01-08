import java.util.Collections;
import java.util.Stack;

class Stacks {
  public static void main(String arg[]) {
    Stack<Integer> stack = new Stack<>();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println(stack);

    System.out.println(stack.pop());
    System.out.println(stack);

    System.out.println(stack.peek());

    stack.push(10);
    System.out.println(stack);

    Collections.sort(stack, Collections.reverseOrder());
    System.out.println(stack);

    System.out.println(stack.isEmpty());

    stack.pop();
    stack.pop();
    stack.pop();

    System.out.println(stack.isEmpty());
    



  }
}