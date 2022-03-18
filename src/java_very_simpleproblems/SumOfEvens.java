package java_very_simpleproblems;
//You are given an integer A, you need to find and return the sum of all the even numbers
// between 1 and A.

import java.lang.*;
import java.util.*;
public class SumOfEvens {
    static int sumEvens(int A) {
        int sum=0;
        for (int i=2; i<=A; i+2) {
            if (i%2==0) {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(sumEvens(A));
    }

}
