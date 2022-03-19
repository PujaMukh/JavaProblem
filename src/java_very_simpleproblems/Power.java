package java_very_simpleproblems;
//find the value of A^B

import java.lang.*;
import java.util.*;
public class Power {
    static int powerOfNumber(int A, int B) {
        int pow=1;
        for (int i=0; i<B; i++) {
            pow=pow*A;
        }
        return pow;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.print(powerOfNumber(A,B));
    }
}
