package java_pattern;
//print this:
//*
//**
//***
//****

import java.lang.*;
import java.util.*;
public class StairPattern {
    static void printStair(int N) {
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        printStair(N);
    }
}
