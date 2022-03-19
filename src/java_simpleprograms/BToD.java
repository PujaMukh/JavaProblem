package java_simpleprograms;

import java.lang.*;
import java.util.*;
public class BToD {
    //if calculating from left to right, use num*base(2)+d
    //if right to left in maths, do 2^0+2^1+.....

    static int binaryToDecimal(String A) {
        int num=0;
        for (int i=0; i<A.length(); i++) {
            num=num*2+A.charAt(i)-'0'; //here -'0' to preserve the value
            //or else it is converting to ascii of the number at charAti
        }
        return num;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(binaryToDecimal(A));
    }

}
