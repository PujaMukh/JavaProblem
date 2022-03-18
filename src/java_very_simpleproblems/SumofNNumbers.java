package java_very_simpleproblems;
//Write a function that takes a positive number A as an argument and
// returns the sum of all numbers from 1 to A.
//formula is n(n+1)/2

import java.lang.*;
import java.util.*;
public class SumofNNumbers {
    static int sumOfNumbers(int A) {
        int result=A*(A+1)/2;
        return result;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(sumOfNumbers(A));
    }

}
