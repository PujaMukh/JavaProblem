package java_very_simpleproblems;
//Write a program to  print count of digits of the given number.

import java.lang.*;
import java.util.*;
public class CountOfDigits {
    static int countDigits(int A) {
        int c=0;
        if (A==0) {
            return 1;
        }
        while (A>0) {
            int d=A%10;
            c++;
            A=A/10;
        }
        return c;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0; i<T; i++) {
            int A=sc.nextInt();
            System.out.print(countDigits(A));
        }

    }
}
