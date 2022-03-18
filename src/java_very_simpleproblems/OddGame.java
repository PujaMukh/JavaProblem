package java_very_simpleproblems;
//Write a program to print all odd numbers from 1 to N where you have to take N as input from user.

import java.lang.*;
import java.util.*;
public class OddGame {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int i=1;
        while(i<=A) {
            System.out.println(i);
            i=i+2;
        }
    }
}
