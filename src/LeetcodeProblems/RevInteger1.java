package LeetcodeProblems;
//reverse integer by not using any long. It has to be in int range.
//eg -123 will be -321

import java.lang.*;
import java.util.*;
public class RevInteger1 {
    static int reverse(int x) {

        int temp=x;
        int rev=0;

        if (x<0) { //making the negative number positive 1st
            temp=temp*(-1);
        }

        while (temp>0) {

            int d=temp%10;
            temp=temp/10;
            //if greater than, there is no use of multiplying with 10
            if (rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && d>7) {
                return 0;
            }
            if (rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && d<-8) {
                return 0;
            }
            rev=rev*10+d;
        }

        if (x<0) {
            return rev*(-1);
        }
        return rev;

    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(); //take input for size of array

        System.out.println(reverse(x));
    }

}
