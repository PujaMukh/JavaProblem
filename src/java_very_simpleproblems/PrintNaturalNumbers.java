package java_very_simpleproblems;
//Write a program to print all Natural numbers from 1 to N where you have to take N
// as input from user

import java.lang.*;
import java.util.*;
public class PrintNaturalNumbers {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=1; i<=N; i++) {
            System.out.println(i);
        }

    }
}
