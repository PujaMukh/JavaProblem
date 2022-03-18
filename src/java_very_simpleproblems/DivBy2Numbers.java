package java_very_simpleproblems;
//You are given an integer A. You have to tell whether A is divible by both 5 and 11 or not.

import java.lang.*;
import java.util.*;
public class DivBy2Numbers {
    static int divisibleByTwoNumbers(int A) {
       if (A%5==0 && A%11==0) {
           return 1;
       }
       return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(divisibleByTwoNumbers(A));
    }
}
