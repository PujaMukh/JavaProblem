package java_sample_oned_array;

import java.lang.*;
import java.util.*;

public class findIndices {
    //find the pair of indices such that sum of those 2 are equal to K where i!=j
        static int pairInd(int[]A, int K) {
            for (int i=0; i<(A.length-1); i++) { //2 loops to check if there are any indices
                for (int j=(i+1); j<A.length; j++) {
                    if(A[i]+A[j]==K) {
                    }
                }
            }
            return 0; //if above loops fail, return false
        }
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);

            int N=sc.nextInt(); //take input for size of array A

            int[] A=new int[N]; //create array A
            for (int i=0; i<N; i++) {
                A[i]=sc.nextInt(); //take input for all elements of array A
            }
            int K=sc.nextInt(); //take input for integer K

            System.out.print(pairInd(A,K));
        }
    }


