package java_sample_oned_array;

import java.lang.*;
import java.util.*;

public class SecondLargest {
    //find 2nd largest in an array using 2 loops
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array N
        int max=Integer.MIN_VALUE; //initialize max
        int max2=Integer.MIN_VALUE; //initialize max2

        int[] A=new int[N]; //declare an array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take values in array A
        }

        if (N==1) {
            System.out.print("NA"); //if size is one there is no 2nd largest
        }
        else {
            for (int i=0; i<N; i++) {
                if (A[i]>max) {
                    max=A[i]; //find max by iterating through all elements
                }
            }
            for (int i=0; i<N; i++) { //loop to find 2nd max now
                if (A[i]>max2 && A[i]<max) {
                    max2=A[i];
                }
            }

        }
        System.out.print(max2);
    }
}
