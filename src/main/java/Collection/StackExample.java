package Collection;

import java.awt.*;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        // pop
        int popElement = stack.pop();
        System.out.println(popElement);

        // peek
        int topElement = stack.peek();
        System.out.println(topElement);

        // empty
        boolean isEmpty = stack.empty();
        System.out.println(isEmpty);

        // search
        int postion = stack.search(3);
        System.out.println(3 +" is found in "+ postion);
    }
}
