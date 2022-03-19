package java_very_simpleproblems;
//sum of all numbers using formula

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
