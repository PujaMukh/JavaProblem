package java_simpleprograms;
import java.lang.*;
import java.util.*;
public class FactorialOfGCD {
    //Given two numbers, find their GCD and prints its factorial
    static int factGCD(int A, int B) {
        //find max and min 1st
        int max=0; //initialize max and min
        int min=0;

        if (A>B) { //int A is greater than B, enter this loop
            max=A;
            min=B;
        }
        else {    //else enter this loop
            max=B;
            min=A;
        }

        int c=max%min; //get the mod 1st
        int d=0; //initialize d variable which will give the GCD result
        if (c==0) { //if there is no remainder, declare min as the GCD
            d=min;
        }
        else {     //else enter this loop and continue until we get remainder 0
            while (c>0) {
                max=min;
                min=c;
                c=max%min;
            }
        }
        d=min;    //once remainder is 0, assign it to d
        int fact=1;
        for (int i=2; i<=d; i++) { //calculate factorial and return the result
            fact=fact*i;
        }
    return fact;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();   //take input of A and B
        int B=sc.nextInt();
        System.out.print(factGCD(A,B));
    }
}

