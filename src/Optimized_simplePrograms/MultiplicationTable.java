package Optimized_simplePrograms;
//multiplication table upto 10 in an optimized way

import java.lang.*;
import java.util.*;
public class MultiplicationTable {
    static void multTable(int A) {
        int temp=A;
        for (int i=1; i<=10; i++) {
            System.out.println(temp);
            temp=temp+A; //adding as multiplication takes more time than addition
        }

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        multTable(A);
    }
}
