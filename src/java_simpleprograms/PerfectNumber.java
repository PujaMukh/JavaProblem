package java_simpleprograms;

//You have to print all the perfect numbers which lie in the range [1, A] in ascending order.
//Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//positive divisor are all factors less than the number

import java.lang.*;
import java.util.*;

public class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();

        //i=perfect number variable
        //j=factors less than i

        for (int i=6; i<=A; i++) { //logic loop
            int sum=0;
            for (int j=1; j<i; j++) {
                if (i%j==0) {
                    sum=sum+j;
                }
            }
            if (sum==i) {
                System.out.println(i);
            }
        }
    }
}
