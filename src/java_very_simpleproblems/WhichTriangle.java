package java_very_simpleproblems;
 //tell if the traingle is either of below mentioned types
//equilateral-all same length
//scalene-all 3 diff
//isosceles-2 equal length

import java.lang.*;
import java.util.*;
public class WhichTriangle {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        if (A==B && A==C && B==C) {
            System.out.println("equilateral");
        }
        else if (A!=B && B!=C && A!=C){
            System.out.println("scalene");
        }
        else {
            System.out.println("isosceles");
        }
    }
}
