package java_sample_oned_array;
//given an array of size N, check if it is sorted

import java.lang.*;
import java.util.*;

public class SortedArray {
    static int IsSortedArray(int[] A) {
        int N = A.length; //size of array

        for (int i = 0; i < N; i++) {
            if (A[i] < A[i + 1]) { //continue loop if a[i]<a[i+1]
            }
            else {
                return 0; //if anywhere a[i]>a[i+1], break loop
            }
            break;
        }
        return 1;  //if full loop ends and we dont get a false, return 1 for true

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for N which is size of array
        int[]A=new int[N]; //declare a blank input array

        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //loop to take input for all elements in input array A
        }
        System.out.print(IsSortedArray(A));
    }
}
