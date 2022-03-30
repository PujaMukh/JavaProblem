package Optimized_simplePrograms;
//given an array, count number of elements having atleast 1 array element greater than itself
//do it in a single iteration....!!!!!
//in 2 iterations:1st iterate and find max, then iterate again and see if A[i]<max, c++
//the main thing here is to find out N-(count of max element in the array)

import java.lang.*;
import java.util.*;
public class CountGreater {
    static int countGreater(int[]A) {
        int max=Integer.MIN_VALUE;
        int N=A.length;
        int count=0;
        int temp=count;

        for (int i=0; i<N; i++) {

            if (A[i]>max) {
                temp=0;
                max=A[i];
                temp=temp+1;
            }

             else if (A[i]==max) {
                   temp=temp+1;
            }

            }

      return N-temp;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare a blank array
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //input values for all elements in array A
        }


        System.out.print(countGreater(A));
    }

}
//TC is O(N) and SC is O(1)