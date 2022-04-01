package Optimized_simplePrograms;
//given an array and an integer B, left rotate it B times

import java.lang.*;
import java.util.*;
public class LeftRotateBTimesOptimized {
    static int[] rotate(int[]A, int B) {
        int N=A.length; //length of array A

        B=B%N;

        if (B==0) {
            return A;
        }

        else {
            //optimized way is to reverse/swap full array 1st and then reverse 1st half and then 2nd half
            for (int i=0; i<N/2; i++) {
                int temp=A[N-1-i];
                A[N-1-i]=A[i];
                A[i]=temp;
            }

            //now that array is reversed we have to 1st reverse 1st part ie from 0 to N-B
            for (int j=0; j<(N-B)/2; j++) {
                int temp1=A[N-B-1-j];
                A[N-B-1-j]=A[j];
                A[j]=temp1;

            }
            //now reverse 2nd part
            for (int k=0; k<B/2; k++) {
                int temp2=A[N-1-k];
                A[N-1-k]=A[N-B+k];
                A[N-B+k]=temp2;
            }
        }
       return A;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //taking input for size, array and int B
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt();
        int[]output=rotate(A,B); //storing in an array since last function returned array
        for (int j=0; j<N; j++) { //print
            System.out.print(output[j]+" ");
        }
    }
}
//TC is O(N) and SC is o(1)