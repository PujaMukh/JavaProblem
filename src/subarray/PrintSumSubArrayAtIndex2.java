package subarray;
//print sum of all subarrays starting at index 2
//O(N) TC in this one

import java.lang.*;
import java.util.*;
public class PrintSumSubArrayAtIndex2 {
    static void printSum(int[]A) {
        int N=A.length;
        int i=2;
        int sum=0;
        for (int j=i; j<N; j++) {
            sum=sum+A[j];
            System.out.println(sum);
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
//TC is O(N), SC is O(1)
