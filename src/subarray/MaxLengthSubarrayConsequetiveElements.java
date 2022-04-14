package subarray;
//find max length subarray with consequetive elements
//consequetive elements are those in a subarray which can be rearranged in a sequence whose absolute
//difference is only 1

import java.lang.*;
import java.util.*;

public class MaxLengthSubarrayConsequetiveElements {
    static int maxLengthSubarray(int[]A) {
        //logic: O(N^2) logic which worked (tried sorting and count sorting by using 01 array but didnt work)
        //make 2 loops and find all subarrays
        //find max and min in each subarray
        //if max-min==j-i which is the index of the subarray-1st index of the subarray, then...
        //length will be j-i+1
        //keep updating maxlength with length and return maxlength

        int N=A.length;
        int length=0;
        int maxLength=0;

        for (int i=0; i<N; i++) {
            int max=0; //keeping it here coz max min will be reset for every new i
            int min=Integer.MAX_VALUE;

            for (int j=i; j<N; j++) {

                if (A[j]>max) {
                    max=A[j];
                }
                if (A[j]<min) {
                    min=A[j];
                }

                if (Math.abs(max-min)==j-i) {
                    length=j-i+1;
                }

                if (length>maxLength) {
                    maxLength=length;
                }


            }

        }
        return maxLength;

    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(maxLengthSubarray(A));
    }
}
//TC is O(N^2), SC is O(1)
