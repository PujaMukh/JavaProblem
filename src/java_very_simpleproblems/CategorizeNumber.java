package java_very_simpleproblems;
import java.lang.*;
import java.util.*;
//Write a program to input a number from user and print 1 if it is positive,
// -1 if it is negative, else 0
public class CategorizeNumber {
    public static void main(String args[]) {
            Scanner puja=new Scanner(System.in);
            int A=puja.nextInt();

            if (A>0) {
                System.out.println("1");
            }
            else if (A<0) {
                System.out.println("-1");
            }
            else {
                System.out.println("0");
            }
        }
    }

