package java_very_simpleproblems;
//For a given number A, print its multiplication table having the first 10 multiples.

import java.lang.*;
import java.util.*;
public class MultiplicationTable {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();

        for (int i=1; i<=10; i++) {
            int result=A*i;
            System.out.println(A+"*"+i+"="+result);
        }

    }
}
