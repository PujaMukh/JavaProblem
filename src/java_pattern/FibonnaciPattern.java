package java_pattern;
//print fibonacci pattern where 1st row is 0

import java.lang.*;
import java.util.*;

public class FibonnaciPattern {
 public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt(); //N input is number of rows

 //1st I am printing 1st 2 rows
     for (int i=1; i<=2; i++) {
             if (i==1) {
                 System.out.println("0");
             }
             else if (i==2) {
                 System.out.println("1"+" "+"1");
             }
         }

     //now printing remaining rows based on logic
     int sum1=1;
     int sum2=1;
     for (int i=3; i<=N; i++) {
         for (int j=1; j<=i; j++) {
             int temp=sum1;
             sum1=sum1+sum2;
             System.out.print(sum1+" ");
             sum2=temp;
         }
         System.out.println();
     }
 }
}
