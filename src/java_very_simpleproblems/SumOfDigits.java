package java_very_simpleproblems;
//Write a program to input T numbers(N) from user and print the sum of the digits of the given numbers.
//N starts from 0 to upto 9 digits

import java.lang.*;
import java.util.*;
public class SumOfDigits {
    static int sumAllDigits(int A) {
        int sum=0;

        while(A>0) {
            int d=A%10;
            sum=sum+d;
            A=A/10;
        }
        return sum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for (int i=0; i<T; i++) {
            int A=sc.nextInt();
            System.out.print(sumAllDigits(A));
        }

    }

}
