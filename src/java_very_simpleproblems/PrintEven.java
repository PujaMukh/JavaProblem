package java_very_simpleproblems;
//Write a program to print all even numbers from 1 to N where you have to take N as input from user.
//Strictly use while loop.

import java.lang.*;
import java.util.*;
public class PrintEven {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int i=2;
        while(i<=A) {
            System.out.println(i);
            i=i+2;
        }
    }
}
