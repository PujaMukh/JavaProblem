package Optimized_simplePrograms;
//given an array, reverse entire array in space complexity O(1)
//dont use extra space

import java.lang.*;
import java.util.*;
public class ReverseArray {
    static void revArray(int[]A) {
        int N=A.length; //length of array

        for (int i=0; i<N/2; i++) {
            int temp=A[N-1-i];
            A[N-1-i]=A[i];
            A[i]=temp;
        }
        for (int i=0; i<N; i++) {   //printing it here
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare array of size N
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all elements of array A
        }
        revArray(A); //since it is already printed in above function, just calling the array
    }
}

//Time complexity is O(N) and Space complexity is O(1)
