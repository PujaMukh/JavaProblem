package java_simpleprograms;
//check if given number exists in fibonacci sequence

import java.lang.*;
import java.util.*;
public class FibonacciProblem {
    static int fibonacciSeries(int A) {
        if (A==0) {
            return 1;
        }
        //sum1 will go to temp and temp will go to sum2
        int sum1=1;
        int sum2=1;
        while(sum1<A) {
            int temp=sum1;
            sum1=sum1+sum2;
            sum2=temp;
        }
        if (sum1==A) {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(fibonacciSeries(A));
    }

}
