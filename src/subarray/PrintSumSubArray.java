package subarray;
//print sum of every subarray

import java.lang.*;
import java.util.*;
public class PrintSumSubArray {
    static void printSum(int[] A) {
        int sum = 0;
        int N = A.length;

        for (int i = 0; i < N; i++) { //start index
            for (int j = i; j < N; j++) { //end index
                sum = sum + A[j];
                System.out.println(sum);
            }
            sum = 0; //again resetting the sum to 0
        }

    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        printSum(A);
    }
}
//TC is O(N^2) and  SC is O(1)
