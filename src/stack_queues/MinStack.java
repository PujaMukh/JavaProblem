package stack_queues;

import linkedlist.Node;

import java.util.*;
import java.util.*;


//design a stack that supports push, pop, top and return min ele in constant time
//stack follows idli cooker  or LIFO model or FILO model.
//it has only 1 pointer which points to top
public class LinkedList {
    Node head;

    //constructor
    public LinkedList() {
        head=null;
    }
    class Node {
        int val;
        Node next;

        //constructor
        public Node (int x) {
            val=x;
            next=null;
        }


            LinkedList<Integer>stack=new LinkedList<>();
            LinkedList<Integer>minStack=new LinkedList<>();

            static void push(int x) {
                stack.push(x);

                if (minStack.isEmpty()) {
                    minStack.push(x);
                }
                else if (x<minStack.peek()) {
                    minStack.push(x);
                }

            }
            static void pop() {
                //question says to return nothing if stack doest have anything
                if (stack.isEmpty()) {
                    return;
                }
                int x=stack.pop(); //store the value of the popped ele in stack ls in int x
                if (minStack.peek()==x) {
                    minStack.pop();
                }

            }
            static int top() {
                if (!stack.isEmpty()) {
                    return stack.peek();
                }
                return -1; //if no ele, return -1 according to question

            }
            static int getMin() {
                if (!stack.isEmpty()) {
                    return minStack.peek();
                }

                return -1;
            }


    }
}

