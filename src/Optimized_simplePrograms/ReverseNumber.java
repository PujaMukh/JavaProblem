package Optimized_simplePrograms;
//reverse a number without using string
//eg. -123 should be -321

import java.lang.*;
import java.util.*;
public class ReverseNumber {
    static int rev(int A) {
        int num=0;
        int d=0;

        int temp=A; //storing A in temp to work on temp because of -1

        if (temp<0) {
            temp=temp*(-1); //converting it to positive
        }
        while (temp>0) {
            d=temp%10;
            num=num*10+d;
            temp=temp/10;
        }
        if (A<0) {      //if original was negative, changing it back to negative
            num=num*(-1);
        }
       return num;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(rev(A));
    }
}
//TC is log A because loop is running till A digits, so log 10 base A and SC is O(1)
