package stack_queues;

import java.util.LinkedList;
import java.util.Scanner;

//check if the given string(containing (,{ and [) are balanced
//eg ({)}=not balance, ({})=balanced
public class BalancedUpgradedVersion {
    static int solve(String A) {
        int N=A.length();
        LinkedList<Character> stack=new LinkedList<>();

        if ((A.charAt(0)==')')|| (A.charAt(0)==']') || A.charAt(0)=='}') {
            return 0;
        }
        if ((A.charAt(N-1)=='(') || (A.charAt(N-1)=='[') || (A.charAt(N-1)=='{')) {
            return 0;
        }
        else {
            for (int i=0; i<N; i++) {
                if ((A.charAt(i)=='(') || (A.charAt(i)=='{') || (A.charAt(i)=='[')) {
                    stack.push(A.charAt(i));
                }
                else if (!stack.isEmpty() && A.charAt(i)==')' && stack.peek()=='(') {
                    stack.pop();
                }
                else if (!stack.isEmpty() && A.charAt(i)=='}' && stack.peek()=='{') {
                    stack.pop();
                }
                if (!stack.isEmpty() && A.charAt(i)==']' && stack.peek()=='[') {
                    stack.pop();
                }

            }
        }
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(solve(A));
    }
}
