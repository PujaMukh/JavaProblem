package java_very_simpleproblems;
//Given an integer A, you have to tell whether it is a prime number or not.

import java.lang.*;
import java.util.*;
public class CheckIfprime {
    //1st find factors. If factors=2, the number is prime, else not
    static int primeNumber(int A) {
        int c=0;
        for (int i=1; i<=A; i++) {
            if (A%i==0) {
                c++;
            }
        }
        if (c==2) {
            return 1;
        }
       return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(primeNumber(A));
    }
}
