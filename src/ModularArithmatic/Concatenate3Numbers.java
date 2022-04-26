package ModularArithmatic;
//concatenate 3 numbers
//eg 10, 20, 30 will be 102030

import java.lang.*;
import java.util.*;
public class Concatenate3Numbers {
    static int concatenate(int A, int B, int C) {
        //find min, max and mid 1st
        int min=Math.min(A, Math.min(B,C));
        int max=Math.max(A, Math.max(B, C));
        int mid=A^B^C^max^min; //it will find mid as the otehr 4 will be xeroed out

        return min*10000+mid*100+max;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        System.out.println(concatenate(A,B,C));


    }
}
//TC is O(1), SC is O(1)
