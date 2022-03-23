package Optimized_simplePrograms;
//find factors of int A in an optimized way

import java.lang.*;
import java.util.*;
public class FindFactors {
    static int findAllFactors(int A) {
        //if a and b are factors, then N/a is also a factor
        int count=0;
        for (int i=1; i*i<=A; i++) {
            if (i==A/i) {
                count=count+1;
            }
            else if (A%i==0) {
                count=count+2;
            }

        }
        return count;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(findAllFactors(A));
    }
}
