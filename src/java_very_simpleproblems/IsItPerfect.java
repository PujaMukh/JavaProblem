package java_very_simpleproblems;
//calculate if the number is a perfect number

import java.lang.*;
import java.util.*;
public class IsItPerfect {
    static int perfectNumber(int A) {
        int sum=0;
        for (int i=1; i<A; i++) {
            if (A%i==0) {
                sum=sum+i;
            }
        }
        if (A==sum) {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for (int i=0; i<N; i++) {
            int A=sc.nextInt();
            System.out.print(perfectNumber(A));
        }
    }
}
