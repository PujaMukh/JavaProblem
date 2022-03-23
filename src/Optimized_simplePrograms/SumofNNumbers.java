package Optimized_simplePrograms;
//finding sum of N numbers

import java.lang.*;
import java.util.*;
public class SumofNNumbers {
    static int sum(int A) {
        int sum=0;
        sum=A*(A+1)/2;
        return sum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(sum(A));
    }
}
