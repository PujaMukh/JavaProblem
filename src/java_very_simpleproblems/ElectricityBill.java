package java_very_simpleproblems;
//Given an integer A denoting the amount of units of electricity consumed,
// you have to calculate the electricity bill (in Rs.) with the help of the below charge conditions:
//For first 50 units Rs. 0.50/unit
//For next 100 units Rs. 0.75/unit
//For next 100 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill.
//NOTE: As the electricity bill can have any real value (floating point),
// you have to tell the floor value of the bill.
//Floor value of a floating point is the closest integer less than or equal to that value.
// For eg, Floor value of 2.91 is 2.
//Input Format
//First line of the input contains a single integer A.
//Output Format
//Return an integer denoting the floor value of the Electricity bill.

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
