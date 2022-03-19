package java_pattern;
//print this:
//1
//1 2
//1 2 3
//1 2 3 4

import java.lang.*;
import java.util.*;
public class NumericPyramid {
    static void numericPyramid(int N) {
        for (int i=1; i<=N; i++) { //for outer row always
            int val=1;
            for (int j=1;j<=i; j++) {
                System.out.print(val+" ");
                val=val+1;
            }
            System.out.println();
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        numericPyramid(N);
    }
}
