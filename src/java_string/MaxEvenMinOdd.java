package java_string;
//given an array of elements, return max of even minus min of odd

import java.lang.*;
import java.util.*;
public class MaxEvenMinOdd {
    static int maxMin(int[]A) {
        int N=A.length; //size of array

        int max_even=Integer.MIN_VALUE;
        int min_odd=Integer.MAX_VALUE;

        for (int i=0; i<N; i++) {
            if (A[i]%2==0) {
                if(A[i]>max_even) {
                    max_even=A[i];
                }

            }
            else {
                if(A[i]<min_odd) {
                    min_odd=A[i];
                }
            }
        }
        return max_even-min_odd;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array

        int[]A=new int[N]; //declare a new array
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all values of i
        }
        System.out.print(maxMin(A));

    }
}
