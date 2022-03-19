package java_very_simpleproblems;
//print all natural numbers from 1 to N

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

