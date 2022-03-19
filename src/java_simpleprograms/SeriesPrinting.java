package java_simpleprograms;

//Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

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
