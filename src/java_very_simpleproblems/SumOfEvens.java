package java_very_simpleproblems;
//sum of all even

import java.lang.*;
import java.util.*;
public class SumOfEvens {
    static int sumEvens(int A) {
        int sum=0;
        for (int i=2; i<=A; i=i+2) {
            if (i%2==0) {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(sumEvens(A));
    }

}
