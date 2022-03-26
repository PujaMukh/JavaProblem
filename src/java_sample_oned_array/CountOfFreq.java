package java_sample_oned_array;
//return an array containing count of ith element in given array

import java.lang.*;
import java.util.*;
public class CountOfFreq {
    static int[] countFreq(int[]A) {
        int N=A.length; //size of array A

        int[]output=new int[N]; //make new array to store the output
        for (int i=0; i<N; i++) {
            int count=0;
            for (int j=0; j<N; j++) {
                if (A[i]==A[j]) {
                   count++;
                }
            }
            output[i]=count;

        }
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];

        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();

        }
        int[]output=countFreq(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }


    }
}
