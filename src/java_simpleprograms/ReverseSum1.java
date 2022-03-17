package java_simpleprograms;
//sum of a number and its reverse by not taking extra space/memory
//so we cannot use string or arraylist

import java.lang.*;
import java.util.*;

public class ReverseSum1 {
    static int revSum(int A) {

        int temp=A; //storing the A in temp because we will need it later to do sum

        int d=0;
        int num=0;
        while (A>0) {
            d=A%10;
            num=num*10+d; //because base 10 here
            A=A/10;
        }

        int sum=0;
        sum=temp+num;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(revSum(A));
    }

}
