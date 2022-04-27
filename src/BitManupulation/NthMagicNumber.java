package BitManupulation;
//find the nth magic number
//magic number is a number that can be expressed in powers of 5 or sum of unique powers of 5
//based on the answers, I observed that it is:
//5^position of binary of 1 in A
//eg. 1=001=5^1, 3=011=5^1+5^2
//write binary of first few A's and you will get a pattern

import java.lang.*;
import java.util.*;

public class NthMagicNumber {
    static int findMagicNumber(int A) {
        //using rightshift operator
        int pow=1;
        int ans=0;

        while(A>0) {

            pow=pow*5;
            if ((A&1)==1) {
                ans=ans+pow;
            }
            A=A>>1;
        }
        return ans;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println(findMagicNumber(A));
    }
}
//TC is O(log n), SC is O(1)
