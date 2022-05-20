package stack_queues;

import java.util.LinkedList;
import java.util.Scanner;

//given a string consisting of ( and ), check if it is balance
public class Balanced {
    static int checkIfBalanced(String A) {
        LinkedList<Character>stack=new LinkedList<>();
        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i)=='(') {
                stack.push(A.charAt(i));
            }
            else if (A.charAt(i)==')' && stack.isEmpty()) {
                return 0;    //no need to add this if stack is empty and this is the only ele
                //this can be teh case if 1st ele is )
                //or everything is popped or balanced and last ele is )
            }
            else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        LinkedList<Character>stack=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(checkIfBalanced(A));
    }
}
