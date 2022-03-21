package java_sample_oned_array;
//given an array of integers and an element B, any number in array can be set to -1.
//calculate min number of operations needed so that max element in array A is B
//do it without using a separate function

import java.lang.*;
import java.util.*;
public class MinOperations {
    static int minOperations(int[]A, int B) {
        int N=A.length;
        boolean d=false;
        int count=0;
        for (int i=0; i<N; i++) { //1st checking if B is present in array A
            if (A[i]==B) {
                d=true;

            }
        }
        if (d==true) {   //if present, find all elements greater than B and return count
            for (int i=0; i<N; i++) {
                if (A[i]>B) {
                    count++;
                }
            }
        }
        else {
            return -1; //if false, return -1
        }
        return count;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //length of array
        int[]A=new int[N]; //declare blank array
        for (int i=0; i<N; i++) { //take input for all elements in array
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt(); //take input for B
        System.out.print(minOperations(A,B));
    }


}
