package BitManupulation;
//given n, calculate number of set bits in n
//1st check using rightshift

import java.lang.*;
import java.util.*;
public class CalculateSetBIts {
    static int calculateSetBits(int n) {
        int count=0;

        while (n>0) {
            if ((1 & n)==1) {
                count++;
            }
            n=n>>1;
        }
        return count;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //take input for size of array

        System.out.println(calculateSetBits(n));
    }

}
//TC is log n base 2 as it is being halved everytime. Here this is better than leftshift with O(1)
//this is exception as the number of iterations are less here than leftshift where iterations are 32 times
//SC is O(1)