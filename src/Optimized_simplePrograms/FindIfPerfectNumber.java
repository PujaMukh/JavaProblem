package Optimized_simplePrograms;
//find if the given number is a perfect number
//perfect number is a number whose sum of divisors (divisors less than that number) is equal to that nmbr

import java.lang.*;
import java.util.*;
public class FindIfPerfectNumber {
    static int perfectNumber(int A) {
        int sum=1; //initializing sum to 1 as we are ignoring the A when considering factors
        //now starting loop from 2 as we are ignoring A when considering the factors
        for (int i=2; i*i<A; i++) { //making the loop only till <A because of above reason
            sum=sum+i+A/i;

        }
        if(sum==A) {
            return 1;
        }
    return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(perfectNumber(A));
    }
}
