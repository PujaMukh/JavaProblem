package java_very_simpleproblems;
//Write a program to find sum all Natural numbers from 1 to N where you have to take N
//as input from user

import java.lang.*;
import java.util.*;
public class SumOfN {
    static int sumOfNNumbers(int A) {
        int sum=0;
        for (int i=1; i<=A; i++) {
            sum=sum+i;
        }
        return sum;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(sumOfNNumbers(A));
    }
}

