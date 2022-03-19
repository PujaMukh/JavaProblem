package java_very_simpleproblems;
//Write a program to  print first and last digits of the given number.

import java.lang.*;
import java.util.*;
public class PrintFirstLastDigits {
    public static void main(String args[]) {
        //1st before starting any loop take the last digit and store it in a variable
        //then start a loop for the other digits
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();

        int last_digit=A%10;
        A=A/10;
        if (A==0) {
            System.out.println(last_digit+" "+last_digit);
        }
       else {
            int first_digit=0;
            while (A>0) {
                first_digit=A%10;
                A=A/10;
            }
            System.out.println(first_digit+" "+last_digit);
        }

    }
}
