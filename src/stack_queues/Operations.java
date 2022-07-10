package stack_queues;

import java.util.LinkedList;

//perform operations-push,pop, top, getmin
public class Operations {
    LinkedList<Integer> stack=new LinkedList<Integer>();
    LinkedList<Integer>minStack=new LinkedList<Integer>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        }
        if (x<minStack.peek()) {

            minStack.push(x);
        }


    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int x=stack.pop();
        if (x==minStack.peek()) {
            minStack.pop();
        }

    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;


    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();



    }
}
