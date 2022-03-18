package java_very_simpleproblems;
//You are given two integers A and B. You have to find the value of A^B.
//NOTE: The value of answer is always less than or equal to 109.

import java.lang.*;
import java.util.*;
public class Power {
    static int powerOfNumber(int A, int B) {
        int pow=1;
        for (int i=0; i<B; i++) {
            pow=pow*A;
        }
        return pow;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.print(powerOfNumber(A,B));
    }
}
