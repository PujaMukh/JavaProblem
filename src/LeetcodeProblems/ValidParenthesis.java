package LeetcodeProblems;

import java.util.LinkedList;
import java.util.Scanner;

//leetcode no 20
//check if the string is valid eg (){}[]=true
public class ValidParenthesis {
    public static boolean isValid(String s) {
        //"(])"=false
        LinkedList<Character> stack=new LinkedList<>();


        if (s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') {
            return false;

        }



        if (s.charAt(s.length()-1)=='(' || s.charAt(s.length()-1)=='{' || s.charAt(s.length()-1)=='[') {
            return false;

        }



        for (int i=0; i<s.length(); i++) {

            if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
                stack.push(s.charAt(i));
            }

            else {
                if (s.charAt(i)==')') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek()=='(') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }

                if (s.charAt(i)==']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek()=='[') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }

                if (s.charAt(i)=='}') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek()=='{') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }



        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();

        System.out.println(isValid(S));
    }
}
