package java_very_simpleproblems;
//print all prime numbers from 1 to N including N

import java.lang.*;
import java.util.*;
public class PrintPrimes {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for (int i=2; i<=N; i++) { //loop for prime numbers
            int c=0;
            for (int j=1; j<=i; j++)  {//loop to find factors of each i
                if (i%j==0) {
                    c++;
                }
            }
            if (c==2) {
                System.out.println(i);
            }
        }
    }
}
