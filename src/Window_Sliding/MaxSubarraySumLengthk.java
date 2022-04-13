package Window_Sliding;
//given an array, find max subarray sum of length k

import java.lang.*;
import java.util.*;
public class MaxSubarraySumLengthk {
    static int maxSum(int[]A, int k) {
        int N=A.length;
        int sum=0;


        for (int i=0; i<k; i++) {
            sum=sum+A[i]; //we got sum of 1st k elements
        }
        //now enter the loop from 1 to end
        int ans=sum;

       int start=1;
        int end=k;
        while (end<N) {
            sum=sum+A[end]-A[start-1];
            start++;
            end++;
            ans=Math.max(ans, sum);

        }
        return ans;


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(maxSum(A, k));
    }
}
//TC is O(N), SC is O(1)
