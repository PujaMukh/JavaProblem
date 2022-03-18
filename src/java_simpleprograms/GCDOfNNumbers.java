package java_simpleprograms;
//GCD of N Numbers
//Given N numbers, find and print their GCD.
//Sample Input:
//5
//20 40 100 55 35
//Sample Output:
//5

import java.lang.*;
import java.util.*;

public class GCDOfNNumbers {
    static int gcdOfNNumbers(int[]A) {
        int N=A.length; //length of array A

       //1st take gcd of 1st 2 numbers and store in temp
        //then take a loop from i=2 to N and d gcd of temp and that index and store in temp
        int min=0;
        int max=0;
        int i=0;
        int c=0;
        int temp=0;
        if (A[i]>A[i+1]) { //line 24-31 is finding the max and min
            max=A[i];
            min=A[i+1];
        }
        else {
            max=A[i+1];
            min=A[i];
        }               //

        c=max%min;    //line 33-44 is finding gcd of 1st 2 numbers and storing it in temp
        if (c==0) {
            temp=min;
        }
        else {
            while(c>0) {
                max=min;
                min=c;
                c=max%min;
            }
            temp=min;
        }

        //now calculate the gcd of temp and 3rd, 4th....n numbers (loop from 3rd number to last)
        for (i=2;i<N; i++) {
            if (temp>A[i]) {
                max=temp;
                min=A[i];
            }
            else {
                max=A[i];
                min=temp;
            }
            c=max%min;
            if(c==0) {
                temp=min;
            }
            else {
                while (c>0) {
                    max=min;
                    min=c;
                    c=max%min;
                }
                temp=min;
            }

        }
        return temp;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt(); //taking input for length of array

        int[]A=new int[N]; //declaring blank array

        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //taking input for all elements in array
        }
        System.out.print(gcdOfNNumbers(A));
    }
}

