package java_very_simpleproblems;
//You are given N positive integers.
//For each given integer A, you have to tell whether it is a perfect number or not.
//Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//First line of the input contains a single integer N.
//Each of the next N lines contains a single integer A.
//eg. 2
//4
//6
//o/p= 0
//1

import java.lang.*;
import java.util.*;
public class IsItPerfect {
    static int perfectNumber(int A) {
        int sum=0;
        for (int i=1; i<A; i++) {
            if (A%i==0) {
                sum=sum+i;
            }
        }
        if (A==sum) {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for (int i=0; i<N; i++) {
            int A=sc.nextInt();
            System.out.print(perfectNumber(A));
        }
    }
}
