package Optimized_simplePrograms;
//given N array elements, check if there exists a pair such that A[i]+A[j]==k and i!=j

import java.lang.*;
import java.util.*;
public class CheckIfPairExists {
    //we dont have to check all pairs as (0,2) is same as (2,0)
    //so either check upper half or lower half

    static boolean checkPair(int[]A, int K) {
        int N=A.length; //size of array A
        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                if (A[i]+A[j]==K) {
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take size of array A
        int[]A=new int[N]; //declare an array of size N
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take inputs for all elements in array A
        }
        int K=sc.nextInt(); //take input for integer K
        System.out.print(checkPair(A,K));
    }
}
// TC is O(N^2) and SC is O(1)