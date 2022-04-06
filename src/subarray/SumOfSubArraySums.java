package subarray;
//given an array, find sum of all subarray sums

import java.lang.*;
import java.util.*;
public class SumOfSubArraySums {
    static int sum(int[]A) {
        //given an array, how many times index i appears
        //if start is from 0 to i and end is from i to N-1
        //formula is (i-0+1)* (N-1-i+1)
        //which comes to (i+1)*(N-i)
        //so sum=(number of times a particular index appears)*(value in that index)

        int N=A.length;
        int numberoftimes_i=0;
        int sum=0;

        for (int i=0; i<N; i++) {
            numberoftimes_i=(i+1)*(N-i);

            sum=sum+(numberoftimes_i)*(A[i]);
        }
        return sum;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(sum(A));
    }

}
//TC is O(N) and SC is O(1)
