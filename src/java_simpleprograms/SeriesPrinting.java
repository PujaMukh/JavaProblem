package java_simpleprograms;

//Take the following as input.
//A number (N1) A number (N2) Write a function which prints first N1 terms of the series
// 3n + 2 which are not multiples of N2.
//Sample Input:
//10 4
//Sample Output:
//5 11 14 17 23 26 29 35 38 41
//Explanation:
//The output will have N1 terms which are not divisible by N2.

import java.lang.*;
import java.util.*;

public class SeriesPrinting {
   public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int N1=sc.nextInt();
       int N2=sc.nextInt();

       int c=0;
       int i=1;
       int d=0;
       while(c<N1) {
           d=3*i+2;
           if (d%N2!=0) {
               c++;
               System.out.print(d+" ");
           }
           i++;
       }
   }
}
