package java_very_simpleproblems;
//calculate floor value of electricity bill

import java.lang.*;
import java.util.*;
public class ElectricityBill {
   public static void main(String args[]) {
       //A is number of units of electricity consumed
       Scanner sc=new Scanner(System.in);
       int A=sc.nextInt();
        int temp=A;
        double bill=0.0;

        if (A<=50) {
            bill=temp*0.50;
        }

        else if (A>50 && A<=150) {
            temp=A-50;
            bill=(50*0.50)+temp*0.75;
        }
        else if (A>150 && A<250) {
            temp=A-150;
            bill=(50*0.50)+(100*0.75)+temp*1.20;
        }
        else {
            temp=A-250;
            bill=(50*0.50)+(100*0.75)+(100*1.20)+temp*1.50;
        }
        double result=bill+bill/5;
         int d=(int)result;
         if (result-d>0.50) {
             System.out.println(d+1);
         }
         else {
             System.out.println(d);
         }

    }
}
