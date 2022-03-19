package java_very_simpleproblems;
//calculate how many days in a non leap year

import java.lang.*;
import java.util.*;
public class HowManydays {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        if (A==1) {
            System.out.println("31");
        }
        else if (A==2) {
            System.out.println("28");
        }
        else if (A==3) {
            System.out.println("31");
        }
        else if (A==4) {
            System.out.println("30");
        }
        else if (A==5) {
            System.out.println("31");
        }
        else if (A==6) {
            System.out.println("30");
        }
        else if (A==7) {
            System.out.println("31");
        }
        else if (A==8) {
            System.out.println("31");
        }
        else if (A==9) {
            System.out.println("30");
        }
        else if (A==10) {
            System.out.println("31");
        }
        else if (A==11) {
            System.out.println("30");
        }
        else {
            System.out.println("31");
        }
    }
}
