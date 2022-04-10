package subarray;
///find the max sum in a subarray from an array but sum should not exceed int B
//did not use sliding window approach
//given all numbers are positive

//logic: start looping from i=0 and j=i and find sum of all elements
//as long as sum<=B, find maxsum by using math.max function and keep updating maxsum
//if we get the maxsum as=B, we can return the value from there
//incase it is >B, we can break the j loop and start again

import java.lang.*;
import java.util.*;

public class MaximumSumPositive {
    static int maxSum(int[]A, int B) {
        int N=A.length; //length of given array A

        int sum=0;
        int maxsum=0;

        for (int i=0; i<N; i++) {
            sum=0;
            for (int j=i; j<N; j++) {
                sum=sum+A[j];

                if (sum<=B) {  //as long as sum is <=B, keep updating max
                    maxsum=Math.max(sum,maxsum);
                }

                if (maxsum==B) { //once it is equal to B, we can return
                    return maxsum;
                }

                if (sum>B) { //if greater, we dont need it, so break j loop and start fresh
                    break;
                }
            }
        }
        return maxsum;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt();
        System.out.println(maxSum(A,B));
    }
}
//TC is O(N^2), SC is O(1)--O(N^2) is the best we can do
