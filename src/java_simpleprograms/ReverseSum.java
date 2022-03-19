package java_simpleprograms;

//Given an integer, find the sum of the number and its reverse.


import java.lang.*;
import java.util.*;
public class ReverseSum {
    static int revSum(int A) {

        int temp=A;
        //to reverse 1st
        String S="";
        while (A>0) {
            int d=A%10;
            A=A/10;
            S=S+d;
        }
        //now string S contains the reversed value
        //time to convert the string to int
        int rev=Integer.valueOf(S);
        int result=rev+temp;
        return result;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(revSum(A));
    }
}
