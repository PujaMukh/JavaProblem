package BitManupulation;
//calculate number of set bits in an integer, now using leftshift operator

import java.lang.*;
import java.util.*;
public class CalculateSetBitsLeftShift {
    static int calculateSetBIts(int n) {
        int count=0;
        int num=1;

        for (int i=0; i<32; i++) {

            if ((num & n)>0) {
                count++;
            }
            num=num<<1;

        }
        return count;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calculateSetBIts(n));
    }

}
//TC is O(1), SC is O(1)
