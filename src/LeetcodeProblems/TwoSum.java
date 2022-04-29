package LeetcodeProblems;
//twosum problem in N^2
//leetcode no 1
//given an array and a target, return indeces from array which add upto the target

import java.lang.*;
import java.util.*;
public class TwoSum {
    static int[] twoSum(int[]A, int target) {
        int N=A.length;
        int[]output=new int[2];

        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                if ((A[i]+A[j])==target) {
                    output[0]=i;
                    output[1]=j;
                }
            }
        }
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int target=sc.nextInt();
       int[] output1=twoSum(A,target);
       for (int i=0; i<2; i++) {
           System.out.print(output1[i]+" ");
       }
    }
}
//TC is O(N^2), SC is O(1) if not considering o/p
